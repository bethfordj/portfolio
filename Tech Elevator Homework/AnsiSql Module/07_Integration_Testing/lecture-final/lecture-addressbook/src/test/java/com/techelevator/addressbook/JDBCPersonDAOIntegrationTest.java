package com.techelevator.addressbook;

import java.sql.SQLException;
import java.util.List;

import org.junit.*;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

public class JDBCPersonDAOIntegrationTest {

	private static SingleConnectionDataSource dataSource;
	private PersonDAO dao;
	
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
		dao = new JDBCPersonDAO(dataSource);
	}
	
	@Test 
	public void save_person() {
		// Arrange
		Person person = new Person();
		person.setFirstName("TestFirst");
		person.setLastName("TestLast");
		
		// Act
		dao.save(person);
		
		// Assert
		Assert.assertTrue(person.getId() > 0);
		Person actualPerson = dao.getPersonById(person.getId());
		Assert.assertEquals(person, actualPerson);
		
	}
	
	@Test
	public void get_all_persons_returns_all_persons() {
		
		// Arrange
		List<Person> originalList = dao.getAllPersons();
		int originalSize = originalList.size();
		
		Person personOne = new Person("TestOne", "TestOneLast");
		Person personTwo = new Person("TestTwo", "TestTwoLast");
		
		dao.save(personOne);
		dao.save(personTwo);
		
		// Act
		List<Person> newList = dao.getAllPersons();
		
		// Assert
		Assert.assertEquals(originalSize + 2, newList.size());
		
	}
	
	@Test
	public void update_person() {
		
		// Arrange
		Person person = new Person("TestFirst", "TestLast");
		dao.save(person);
		
		person.setFirstName("FirstUpdated");
		person.setLastName("LastUpdated");
		
		// Act
		dao.update(person);
		
		// Assert
		Person actualPerson = dao.getPersonById(person.getId());
		
		Assert.assertEquals(person, actualPerson);
		
	}
	
}
