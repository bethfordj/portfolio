package com.techelevator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.techelevator.dao.CityDAO;
import com.techelevator.dao.model.City;

@Controller
@RequestMapping("/addCity")
@SessionAttributes({"user", "bgClass", "city"})
public class CityAddWizardController {

	@Autowired
	private CityDAO cityDao;
	
	@RequestMapping(path="/stepOne", method=RequestMethod.GET)
	public String showStepOne() {
		return "wizard/addCityPart1";
	}
	
	@RequestMapping(path="/stepOne", method=RequestMethod.POST)
	public String doStepOne(@RequestParam String name, ModelMap map) {
		
		City city = new City();
		city.setCountryCode("USA");
		city.setName(name);
		
		map.addAttribute("city", city);
		
		return "wizard/addCityPart2";
		
	}
	
	@RequestMapping(path="/stepTwo", method=RequestMethod.POST)
	public String doStepTwo(@RequestParam String state, ModelMap map) {
		
		City city = (City) map.get("city");
		city.setDistrict(state);
		
		return "wizard/addCityPart3";
		
	}
	
	@RequestMapping(path="/stepThree", method=RequestMethod.POST)
	public String doStepThree(@RequestParam int population, ModelMap map) {
		
		City city = (City) map.get("city");
		city.setPopulation(population);
		
		return "wizard/confirm";
	}
	
	@RequestMapping(path="/confirm", method=RequestMethod.POST)
	public String addCity(ModelMap map) {
		
		City city = (City) map.get("city");
		cityDao.save(city);
		
		return "redirect:/";
	}
	
}
