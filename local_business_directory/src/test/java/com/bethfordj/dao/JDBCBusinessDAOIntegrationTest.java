package com.bethfordj.dao;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import com.bethfordj.dao.model.Address;
import com.bethfordj.dao.model.Business;
import com.bethfordj.dao.model.BusinessType;
import com.bethfordj.dao.model.ContactInfo;


public class JDBCBusinessDAOIntegrationTest extends DAOIntegrationTest {
	
	private JDBCBusinessDAO dao = new JDBCBusinessDAO(getDataSource());
	private JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
	

	@Test
	public void get_all_businesses_no_sort() {
		List<Business> startList = dao.getAll();
		int startLength = startList.size();
		
		dao.saveNewBusiness(makeTestBusiness1());
		
		List<Business> endList = dao.getAll();
		int endLength = endList.size();
		
		Assert.assertEquals(startLength + 1, endLength);	
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

}
