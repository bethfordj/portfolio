package com.techelevator;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techelevator.dao.ActorDao;
import com.techelevator.dao.model.Actor;

@Controller
public class ActorSearchController {

	@Autowired
	private ActorDao actorDao;

	/* What request mapping do we want here */
	@RequestMapping("/ActorSearch")
	public String showSearchActorForm() {
		return "actorList";
	}

	/* What about here? */
	@RequestMapping("/ActorSearchResults")
	public String searchActors(HttpServletRequest req) {
		List<Actor> actors = actorDao.getMatchingActors(req.getParameter("last_Name"));
		req.setAttribute("actors", actors);
		
		return "actorList";
	}
}
