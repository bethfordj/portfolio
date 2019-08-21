package com.techelevator.addressbook;

import java.util.List;

public interface PersonDAO {

	void save(Person person);
	Person getPersonById(int id);
	List<Person> getAllPersons();
	void update(Person person);
	void delete(int id);
	
}
