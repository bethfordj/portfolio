package com.techelevator.dao;

import java.util.List;

import com.techelevator.dao.model.Person;

public interface PersonDAO {

	List<Person> getAll();
	void add(Person person);
	
}
