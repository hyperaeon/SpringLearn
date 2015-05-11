package com.spring.chapter11;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.chapter10.SpitterService;

@Controller
@RequestMapping("/displaySpittle.htm")
public class DisplaySpittleController {

	private final SpitterService spitterService;

	@Inject
	public DisplaySpittleController(SpitterService spitterService) {
		this.spitterService = spitterService;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String showSpittle(@RequestParam("id") long id, Model model) {
		model.addAttribute(spitterService.getSpittleById(id));
		return "spitles/view";
	}
}
