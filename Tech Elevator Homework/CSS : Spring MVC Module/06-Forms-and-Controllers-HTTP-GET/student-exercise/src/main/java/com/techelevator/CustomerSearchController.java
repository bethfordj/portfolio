package com.techelevator;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techelevator.dao.CustomerDao;
import com.techelevator.dao.model.Customer;

@Controller
public class CustomerSearchController {

    @Autowired
    private CustomerDao customerDao;
    
    
    @RequestMapping("/CustomerSearch")
    public String showSearchCustomerForm(){
    	return "customerList";
    }
    
    @RequestMapping("/CustomerSearchResults")
    public String searchCustomers(HttpServletRequest req) {
    	
    	List<Customer> customers = customerDao.searchAndSortCustomers(req.getParameter("search"), req.getParameter("sort"));
    	req.setAttribute("customers", customers);
    	
    	return "customerList";
    }

}