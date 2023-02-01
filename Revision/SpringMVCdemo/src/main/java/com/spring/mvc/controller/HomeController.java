package com.spring.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("home")
	public String home(Model model) {
		System.out.println("This is home url");
		
		model.addAttribute("key", "Welcome to home page");
		
		return "index";
	}
	
	@RequestMapping("about")
	public String about(Model model) {
		System.out.println("This is about page.");
		
		model.addAttribute("aboutKey", "This is the about page where you will get to know about our service.");
		List<String> friends=new ArrayList<String>();
		friends.add("Ajay");
		friends.add("Axat");
		friends.add("Rahul");
		model.addAttribute("f", friends);
		
		return "about";
	}
	
	@RequestMapping("/")
	public String welcome(Model model) {
		model.addAttribute("key", "Welcome");
		
		return "index";
	}

}
