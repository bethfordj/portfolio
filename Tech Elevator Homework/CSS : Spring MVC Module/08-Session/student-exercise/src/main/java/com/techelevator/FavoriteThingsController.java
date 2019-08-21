package com.techelevator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("favorite")
@RequestMapping("/FavoriteThings")
public class FavoriteThingsController {
	
	@RequestMapping(path="/Page1", method = RequestMethod.GET)
	public String displayFavoriteColor() {

		return "page1";
	}

	@RequestMapping(path="/Page1", method = RequestMethod.POST)
	public String getFavoriteColor(@RequestParam String color, ModelMap map) {
		FavoriteThings fav = new FavoriteThings();
		fav.setColor(color);
		map.addAttribute("favorite", fav);

		return "page2";
	}
	
	@RequestMapping(path="/Page2", method = RequestMethod.POST)
	public String getFavoriteFood(@RequestParam String food, ModelMap map) {
		
		FavoriteThings fav = (FavoriteThings) map.get("favorite");
		fav.setFood(food);

		return "page3";
	}
	
	@RequestMapping(path="/Page3", method = RequestMethod.POST)
	public String getFavoriteSeason(@RequestParam String season, ModelMap map) {
		
		FavoriteThings fav = (FavoriteThings) map.get("favorite");
		fav.setSeason(season);

		return "redirect:/FavoriteThings/Summary";
	}
	
	@RequestMapping(path="/Summary", method = RequestMethod.GET)
	public String displaySummary() {

		return "summary";
	}
	
}
