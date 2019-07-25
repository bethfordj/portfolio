package com.bethfordj.dao;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import com.bethfordj.dao.model.Address;
import com.bethfordj.dao.model.Business;
import com.bethfordj.dao.model.BusinessFilter;
import com.bethfordj.dao.model.BusinessSortOrder;
import com.bethfordj.dao.model.BusinessType;
import com.bethfordj.dao.model.ContactInfo;


public class JDBCBusinessDAOIntegrationTest extends DAOIntegrationTest {
	
	private JDBCBusinessDAO dao = new JDBCBusinessDAO(getDataSource());
	private JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
	

	@Test
	public void get_all_businesses_no_sort() {
		deleteAllTableData();
		dao.saveNewBusiness(makeTestBusiness1());
		List<Business> startList = dao.getAll();
		int startLength = startList.size();
		
		dao.saveNewBusiness(makeTestBusiness2());
		
		List<Business> endList = dao.getAll();
		int endLength = endList.size();
		
		Assert.assertEquals(startLength + 1, endLength);	
	}
	
	@Test
	public void get_all_businesses_general_type_sort_only() {
		deleteAllTableData();
		
		BusinessSortOrder busSortOrder = BusinessSortOrder.valueOfLabel("GeneralType");
		BusinessFilter busFilter = new BusinessFilter();
		
		dao.saveNewBusiness(makeTestBusiness1());
		dao.saveNewBusiness(makeTestBusiness2());
		List<Business> busList = dao.getAll(busFilter, busSortOrder);
		
		Business firstBusiness = busList.get(0);
		
		Assert.assertEquals("testBus", firstBusiness.getBusinessName());	
	}
	
	@Test
	public void get_all_businesses_rating_high_to_low_sort_only() {
		deleteAllTableData();
		
		BusinessSortOrder busSortOrder = BusinessSortOrder.valueOfLabel("RatingHighToLow");
		BusinessFilter busFilter = new BusinessFilter();
		
		dao.saveNewBusiness(makeTestBusiness1());
		dao.saveNewBusiness(makeTestBusiness2());
		List<Business> busList = dao.getAll(busFilter, busSortOrder);
		
		Business firstBusiness = busList.get(0);
		
		Assert.assertEquals("testBus", firstBusiness.getBusinessName());	
	}
	
	@Test
	public void get_all_businesses_rating_low_to_high_sort_only() {
		deleteAllTableData();
		
		BusinessSortOrder busSortOrder = BusinessSortOrder.valueOfLabel("RatingLowToHigh");
		BusinessFilter busFilter = new BusinessFilter();
		
		dao.saveNewBusiness(makeTestBusiness1());
		dao.saveNewBusiness(makeTestBusiness2());
		List<Business> busList = dao.getAll(busFilter, busSortOrder);
		
		Business firstBusiness = busList.get(0);
		
		Assert.assertEquals("testBusiness", firstBusiness.getBusinessName());	
	}
	
	@Test
	public void get_all_businesses_filter_by_city_only_no_sort() {
		deleteAllTableData();
		
		BusinessSortOrder busSortOrder = null;
		BusinessFilter busFilter = new BusinessFilter();
		busFilter.setCityName("testCity");
		
		dao.saveNewBusiness(makeTestBusiness1());
		dao.saveNewBusiness(makeTestBusiness2());
		List<Business> busList = dao.getAll(busFilter, busSortOrder);
		int listLength = busList.size();
		
		Assert.assertEquals(2, listLength);	
	}
	
	@Test
	public void get_all_businesses_filter_by_city_sort_by_general_type() {
		deleteAllTableData();
		
		BusinessSortOrder busSortOrder = BusinessSortOrder.valueOfLabel("GeneralType");
		BusinessFilter busFilter = new BusinessFilter();
		busFilter.setCityName("testCity");
		
		dao.saveNewBusiness(makeTestBusiness1());
		dao.saveNewBusiness(makeTestBusiness2());
		List<Business> busList = dao.getAll(busFilter, busSortOrder);
		int listLength = busList.size();
		Business firstBusiness = busList.get(0);
		
		Assert.assertEquals("testBus", firstBusiness.getBusinessName());	
		Assert.assertEquals(2, listLength);	
		
	}
	
	@Test
	public void save_business() {
		deleteAllTableData();
		Business business = makeTestBusiness1();
		dao.saveNewBusiness(business);
		Assert.assertTrue(dao.isExistingBusiness(business));
	}
	
	@Test
	public void is_not_an_existing_business() {
		deleteAllTableData();
		Assert.assertFalse(dao.isExistingBusiness(makeTestBusiness1()));
	}
	
	private Business makeTestBusiness1() {
		Business testBusiness1 = new Business();
		testBusiness1.setBusinessName("testBusiness");
		testBusiness1.setSlogan("The Best Test Business To Best Test!");
		testBusiness1.setRating(4.73);
		testBusiness1.setAddress(makeTestAddress());
		testBusiness1.setContact(makeTestContact());
		testBusiness1.setType(makeTestType1());
		return testBusiness1;
	}
	
	private Business makeTestBusiness2() {
		Business testBusiness2 = new Business();
		testBusiness2.setBusinessName("testBus");
		testBusiness2.setSlogan("That One Place!");
		testBusiness2.setRating(4.72);
		testBusiness2.setAddress(makeTestAddress());
		testBusiness2.setContact(makeTestContact());
		testBusiness2.setType(makeTestType2());
		return testBusiness2;
	}
	
	private Address makeTestAddress() {
		Address testAddress = new Address();
		testAddress.setStreet1("123 Test St.");
		testAddress.setCity("testCity");
		testAddress.setState("testState");
		testAddress.setZipCode(12345);
		return testAddress;
	}
	
	private ContactInfo makeTestContact() {
		ContactInfo testContact = new ContactInfo();
		testContact.setPhone1("999-999-9999");
		testContact.setEmail("test@test.com");
		testContact.setLabel1("Mobile");
		testContact.setWebsite("www.test.com");
		return testContact;
	}
	
	private BusinessType makeTestType1() {
		BusinessType testType = new BusinessType();
		testType.setGeneralType("genTest");
		testType.setSpecificType("specTest");
		return testType;
	}
	
	private BusinessType makeTestType2() {
		BusinessType testType = new BusinessType();
		testType.setGeneralType("that one");
		testType.setSpecificType("the one over there at the place");
		return testType;
	}
	
	private void deleteAllTableData() {
		String sql = "Truncate business_type Cascade;\n" + 
				"Truncate type Cascade;\n" + 
				"Truncate address Cascade;\n" + 
				"Truncate contact Cascade;\n" + 
				"Truncate business Cascade;";
		jdbcTemplate.update(sql);
	}

}
