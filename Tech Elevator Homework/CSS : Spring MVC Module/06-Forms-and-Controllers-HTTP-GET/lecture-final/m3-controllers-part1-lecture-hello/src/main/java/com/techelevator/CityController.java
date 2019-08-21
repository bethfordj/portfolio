package com.techelevator;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techelevator.model.city.City;
import com.techelevator.model.city.CityDAO;

@Controller
public class CityController {

	@Autowired
	private CityDAO dao;
	
	@RequestMapping("/search")
	public String displayCitySearch() {
		return "city/citySearch";
	}
	 
	@RequestMapping("/cities")
	public String displayCitySearchResults(HttpServletRequest req) 
	{
		String countryCode = req.getParameter("countryCode");
		List<City> results = dao.findCityByCountryCode(countryCode);
		req.setAttribute("cities", results);
		
		return "city/results";
		
	}
}
