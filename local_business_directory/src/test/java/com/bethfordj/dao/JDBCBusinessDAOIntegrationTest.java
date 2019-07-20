package com.bethfordj.dao;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;


public class JDBCBusinessDAOIntegrationTest extends DAOIntegrationTest {
	
	private JDBCBusinessDAO dao = new JDBCBusinessDAO(getDataSource());
	private JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
	
	private String sqlTestBusInsert1 = "Insert Into business (business_id, name, slogan, image, rating) " +
				"Values (default, 'testBusiness', 'The Best Test Business To Best Test!', 'testImageName', '4.73'); " +
			"Insert Into type (type_id, specific_type, general_type) " +
				"Values (default, 'testSpecType', 'testGenType'); " +
			"Insert Into address (address_id, business_id, street1, state, zip_code) " +
				"Values (default, (Select business_id from business Where name = 'testBusiness'), '123 Test St.', 'Ohio', 42231); " + 
			"Insert Into contact (contact_id, business_id, phone1, label1, email, url) " +
				"Values (default, (Select business_id from business Where name = 'testBusiness'), '999-999-9999', 'Mobile', 'test@test.com', 'www.test.com'); " + 
			"Insert Into business_type (business_id, type_id) " +
				"Values ((Select business_id from business Where name = 'testBusiness')," +
				"(Select type_id from type Where (specific_type = 'testSpecType') AND (general_type = 'testGenType')));"; 

	private String sqlTestBusInsert2 = "Insert Into business (business_id, name, slogan, image, rating) " +
			"Values (default, 'businessTest', 'The Best Test Business To Best Test!', 'testImageName', '4.7'); " +
		"Insert Into type (type_id, specific_type, general_type) " +
			"Values (default, 'specTypeTest', 'genTypeTest'); " +
		"Insert Into address (address_id, business_id, street1, state, zip_code) " +
			"Values (default, (Select business_id from business Where name = 'businessTest'), '123 Test St.', 'Ohio', 42231); " + 
		"Insert Into contact (contact_id, business_id, phone1, label1, email, url) " +
			"Values (default, (Select business_id from business Where name = 'businessTest'), '999-999-9999', 'Mobile', 'test@test.com', 'www.test.com'); " + 
		"Insert Into business_type (business_id, type_id) " +
			"Values ((Select business_id from business Where name = 'businessTest')," +
			"(Select type_id from type Where (specific_type = 'specTypeTest') AND (general_type = 'genTypeTest')));"; 
	
	@Test
	public void get_all_businesses_no_sort() {
		List<Business> startList = dao.getAll();
		int startLength = startList.size();
		
	}

}
