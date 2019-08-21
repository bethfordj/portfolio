package com.techelevator.addressbook;

import java.util.List;

public interface PhoneDAO {

	Phone getPhoneById(int phoneId);
	List<Phone> getPhoneEntriesByPersonId(int personId);
	
	void save(Phone phone);
	void update(Phone phone);
	void delete(int phoneId);
}
