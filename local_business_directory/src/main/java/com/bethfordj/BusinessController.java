package com.bethfordj;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.bethfordj.dao.BusinessDAO;
import com.bethfordj.dao.model.Business;

@SessionAttributes("businessList")
@Controller
public class BusinessController {
	
	@Autowired
	BusinessDAO businessDAO;
	
	
	
	@RequestMapping(path="/", method=RequestMethod.GET)
	public String showBaseBusinessList(ModelMap map) {
		List<Business> businessList = businessDAO.getAll();
		map.addAttribute("businessList", businessList);
		
//		for(Business b: businessList) {
//			System.out.println(b.getBusinessName());
//		}
		return "businessListPage1";
	}
	
	
	
	
	
	

}
