package com.techelevator.addressbook;

import java.sql.SQLException;
import java.util.List;

import org.junit.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JDBCPhoneDAOIntegrationTest {


	private static SingleConnectionDataSource dataSource;
	private PhoneDAO dao;
	private JdbcTemplate jdbcTemplate;
	private int testPersonId;
	
	@BeforeClass
	public static void setupDataSource() {
		dataSource = new SingleConnectionDataSource();
		dataSource.setUrl("jdbc:postgresql://localhost:5432/addressbook");
		dataSource.setUsername("postgres");
		dataSource.setPassword("postgres1");
		dataSource.setAutoCommit(false);
	}
	
	@AfterClass
	public static void closeDataSource() {
		dataSource.destroy();
	}
	
	@After
	public void rollback() throws SQLException {
		dataSource.getConnection().rollback();
	}
	
	@Before
	public void setup() {
		String sql = "INSERT INTO person (user_id, first_name, last_name) VALUES (DEFAULT, 'TestFirst', 'TestLast') RETURNING user_id";
		jdbcTemplate = new JdbcTemplate(dataSource);
		truncateTables();
		SqlRowSet result = jdbcTemplate.queryForRowSet(sql);
		result.next();
		testPersonId = result.getInt(1);
		dao = new JDBCPhoneDAO(dataSource);
	}
	
	@Test
	public void save_phone() {
		
		// Arrange
		Phone phone = new Phone();
		phone.setPersonId(testPersonId);
		phone.setCategory("Home");
		phone.setPhoneNumber("555-555-6966");
		
		// Act
		dao.save(phone);
		
		// Assert
		// Assert Phone has id
		Assert.assertTrue(phone.getPhoneId() > 0);
		
		// Assert Phone in database matches our phone
		Phone actualPhone = dao.getPhoneById(phone.getPhoneId());
		assertPhonesEqual(phone, actualPhone);
		
		// Assert Phone has a relationship with the person
		assertPersonPhoneRelationshipExists(testPersonId, phone.getPhoneId());
	}
	
	@Test
	public void get_all_phone_numbers_for_person() {
		// Arrange
		createPhone(testPersonId);
		createPhone(testPersonId);
		
		// Act
		List<Phone> phoneList = dao.getPhoneEntriesByPersonId(testPersonId);
		
		// Assert
		Assert.assertEquals(2, phoneList.size());
		Assert.assertEquals(2, getPhonePersonRelationshipCount(testPersonId));
		
	}
	
	private Phone createPhone(int personId) {
		Phone phone = new Phone();
		phone.setPersonId(personId);
		phone.setCategory("Mobile");
		phone.setPhoneNumber("555-555-5555");
		dao.save(phone);
		return phone;
	}
	
	private int getPhonePersonRelationshipCount(int personId) {
		String sql = "SELECT COUNT(*) FROM person_phone WHERE user_id = ?";
		SqlRowSet result = jdbcTemplate.queryForRowSet(sql, personId);
		result.next();
		return result.getInt(1);
	}
	
	private void assertPersonPhoneRelationshipExists(int personId, int phoneId) {
		String sql = "SELECT * FROM person_phone WHERE user_id = ? AND phone_id = ?";
		SqlRowSet result = jdbcTemplate.queryForRowSet(sql, personId, phoneId);
		Assert.assertTrue(result.next());
	}
	
	private void assertPhonesEqual(Phone expected, Phone actual) {
		Assert.assertEquals(expected.getPhoneId(), actual.getPhoneId());
		Assert.assertEquals(expected.getPersonId(), actual.getPersonId());
		Assert.assertEquals(expected.getCategory(), actual.getCategory());
		Assert.assertEquals(expected.getCategoryDescription(), actual.getCategoryDescription());
		Assert.assertEquals(expected.getPhoneNumber(), actual.getPhoneNumber());
	}
	
	private void truncateTables() {
		String truncateSql = "TRUNCATE person CASCADE; TRUNCATE phone CASCADE";
		jdbcTemplate.update(truncateSql);
	}
}
