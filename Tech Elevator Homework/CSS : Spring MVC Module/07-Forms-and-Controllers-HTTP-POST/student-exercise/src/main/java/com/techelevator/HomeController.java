package com.techelevator;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techelevator.model.Review;
import com.techelevator.model.ReviewDao;

@Controller
public class HomeController {
	
	@Autowired
	private ReviewDao reviewDao;

	@RequestMapping("/home")
	public String displayHome(HttpServletRequest req) {
		
		List<Review> allReviews = reviewDao.getAllReviews();
		req.setAttribute("reviews", allReviews);
		
		return "home";
	}
	
}
