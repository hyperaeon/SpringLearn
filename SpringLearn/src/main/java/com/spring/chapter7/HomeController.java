package com.spring.chapter7;

import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	private static int DEFAULT_PER_PAGE = 25;
	
	@Inject
	private SpitterService spitterService;
	
	public HomeController(SpitterService spitterService) {
		this.spitterService = spitterService;
	}
	
	@RequestMapping({"/","/home"})
	public String showHomePage(Map<String, Object> model) {
		model.put("spittles", spitterService.getRecentSpittles(DEFAULT_PER_PAGE));
		return "home";
	}
}
