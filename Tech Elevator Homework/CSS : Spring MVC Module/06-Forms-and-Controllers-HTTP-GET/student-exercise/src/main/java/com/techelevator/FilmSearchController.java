package com.techelevator;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techelevator.dao.FilmDao;
import com.techelevator.dao.model.Film;

/**
 * FilmSearchController
 */
@Controller
public class FilmSearchController {

    @Autowired
    FilmDao filmDao;

    @RequestMapping("/FilmSearch")
    public String showFilmSearchForm() {
        return "filmList";
    }
    
    @RequestMapping("/FilmSearchResults")
    public String searchFilms(HttpServletRequest req) {
    
    int minLength = 0;
    int maxLength = 200;
    	
    if ((req.getParameter("minLength").equals("") == false)) {
        minLength = Integer.parseInt(req.getParameter("minLength"));
    }
    if (req.getParameter("maxLength").equals("") == false) {
        maxLength = Integer.parseInt(req.getParameter("maxLength"));
    }
    	
    List<Film> filmResults = filmDao.getFilmsBetween(req.getParameter("genre"), minLength, maxLength);
    req.setAttribute("films", filmResults);
    
        return "filmList";
    }

}