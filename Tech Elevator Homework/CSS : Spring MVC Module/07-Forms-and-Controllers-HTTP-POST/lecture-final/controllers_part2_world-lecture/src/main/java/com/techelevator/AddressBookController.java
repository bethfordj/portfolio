package com.techelevator;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.techelevator.dao.PersonDAO;
import com.techelevator.dao.model.Person;

@Controller
public class AddressBookController {

	@Autowired
	private PersonDAO personDao;
	
	@RequestMapping(path="/persons", method=RequestMethod.GET)
	public String showPersonList(ModelMap map) {
		
		// Get The Persons from the DAO
		List<Person> contacts = personDao.getAll();
		
		map.addAttribute("contacts", contacts);
		
		// Return the Logical View Name for the personList page
		return "personList";
	}
	
	
	@RequestMapping(path="/persons", method=RequestMethod.POST)
	public String addPerson(Person person) {
		
		// Add the person to the Database
		personDao.add(person);
		
		// Redirect to the Original GET
		return "redirect:/persons";
	}
	
}
