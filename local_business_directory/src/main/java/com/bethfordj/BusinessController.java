package com.bethfordj;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BusinessController {
	
	
	@RequestMapping(path="/", method=RequestMethod.GET)
	public String showBaseBusinessList() {
				
		return "businessListPage1";
	}
	
	
	
	

}
