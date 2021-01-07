package com.accenture.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.accenture.bean.User;

@Controller
public class welcome_controller {
	
	@RequestMapping("/")
	public ModelAndView loadValues()
	{
		return new ModelAndView("login","user", new User());
	}

	@RequestMapping(value = "login", method=RequestMethod.POST)
	public ModelAndView login(@ModelAttribute("user")User user)
	{
		ModelAndView mv = new ModelAndView();
		if(user.getPassword().equals("admin"))
		{
			mv.setViewName("welcome");
			mv.addObject("user", user);
		}
		else
		{
			mv.setViewName("failure");
		}
		
		return mv;
	}

}
