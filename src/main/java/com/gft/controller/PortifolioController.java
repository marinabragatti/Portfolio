package com.gft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PortifolioController {

	@RequestMapping("/portfolio")
	public ModelAndView showPortfolio() {
		ModelAndView mv = new ModelAndView("PortifolioMarina");
		return mv;
	}
	
	@RequestMapping("/experience")
	public ModelAndView showExperience() {
		ModelAndView mv = new ModelAndView("Experience");
		return mv;
	}
	
	@RequestMapping("/education")
	public ModelAndView showEducation() {
		ModelAndView mv = new ModelAndView("Education");
		return mv;
	}
	
	@RequestMapping("/skills")
	public ModelAndView showSkills() {
		ModelAndView mv = new ModelAndView("Skills");
		return mv;
	}
	
}
