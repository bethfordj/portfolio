package com.techelevator;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.techelevator.model.Review;
import com.techelevator.model.ReviewDao;

@Controller
public class ReviewFormController {

	@Autowired
	private ReviewDao reviewDao;

	@RequestMapping(path = "/review", method = RequestMethod.GET)
	public String displayReviewForm() {
		return "reviewForm";
	}

	@RequestMapping(path = "/review", method = RequestMethod.POST)
	public String submitForm(Review post, HttpServletRequest req) {
		
		post.setDateSubmitted(LocalDateTime.now());
		post.setRating(Integer.parseInt(req.getParameter("rating")));
		post.setUsername(req.getParameter("username"));
		post.setText(req.getParameter("text"));
		post.setTitle(req.getParameter("title"));
		reviewDao.save(post);

		return "redirect:/home";
	}

}
