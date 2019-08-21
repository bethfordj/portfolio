package com.techelevator;

import java.util.List;

import org.apache.commons.dbcp2.BasicDataSource;

import com.techelevator.addressbook.JDBCPersonDAO;
import com.techelevator.addressbook.JDBCPhoneDAO;
import com.techelevator.addressbook.Person;
import com.techelevator.addressbook.PersonDAO;
import com.techelevator.addressbook.Phone;
import com.techelevator.addressbook.PhoneDAO;

public class PersonExample {

	public static void main(String[] args) {
		
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setUrl("jdbc:postgresql://localhost:5432/addressbook");
		dataSource.setUsername("postgres");
		dataSource.setPassword("postgres1");
		
		PersonDAO personDao = new JDBCPersonDAO(dataSource);
		
		Person person = new Person();
		person.setFirstName("Andrew");
		person.setLastName("Franks");
		
		personDao.save(person);
		
		Person newPerson = personDao.getPersonById(person.getId());
		
		System.out.println(newPerson);
		
		List<Person> allPersons = personDao.getAllPersons();
		for (Person p : allPersons) {
			System.out.println(p);
		}
		
		person.setLastName("Frank");
		personDao.update(person);

		personDao.delete(person.getId());

		for (Person p : personDao.getAllPersons()) {
			System.out.println(p);
		}
		
		// Phone DAO
		PhoneDAO phoneDao = new JDBCPhoneDAO(dataSource);
		
		// Insert a Person to have a phone
		Person phonePerson = new Person("Joe", "Hasphone");
		personDao.save(phonePerson);
		
		// Insert the Phone, using the person Id
		Phone phone = new Phone();
		phone.setPersonId(phonePerson.getId());
		phone.setCategory("Home");
		phone.setPhoneNumber("555-777-9988");
		phoneDao.save(phone);
		
		// Get the phone using the ID set by side effect
		Phone newPhone = phoneDao.getPhoneById(phone.getPhoneId());
		System.out.println(newPhone);
		
		// Insert a Second phone for the person
		phone = new Phone();
		phone.setPersonId(phonePerson.getId());
		phone.setCategory("Mobile");
		phone.setPhoneNumber("555-212-2899");
		phoneDao.save(phone);
		
		// Get and Print the phones assigned to the person, there should be 2
		System.out.println("Phones assigned to Person with Id " + phonePerson.getId());
		for (Phone p : phoneDao.getPhoneEntriesByPersonId(phonePerson.getId())) {
			System.out.println(p);
		}
		
		// Update the first phone number
		phone.setPhoneNumber("999-999-9999");
		phoneDao.update(phone);
		
		// Get the phone to see the update
		newPhone = phoneDao.getPhoneById(phone.getPhoneId());
		System.out.println(newPhone);
		
		// Delete the first phone number
		phoneDao.delete(phone.getPhoneId());
		
		// Get and Print the phones assigned to the person, there should now be 1
		System.out.println("Phones assigned to Person with Id " + phonePerson.getId());
		for (Phone p : phoneDao.getPhoneEntriesByPersonId(phonePerson.getId())) {
			System.out.println(p);
		}
	}

}
