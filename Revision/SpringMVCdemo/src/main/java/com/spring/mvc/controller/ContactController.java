package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.model.User;

@Controller
public class ContactController {
	@RequestMapping("/contact")
	public String contact() {
		return "contact";
	}
	
	
	@RequestMapping("/processData")
	public String dataHandler(@ModelAttribute User user, Model model) {
		/*
		@RequestParam("email") String email, @RequestParam("userName") String name, @RequestParam("mobileNumber") Integer mobile
		User user=new User();
		user.setEmail(email);
		user.setUserName(name);
		user.setMobileNumber(mobile);
		
		
		model.addAttribute("user", user);
		*/
		
		System.out.println(user);
		
		return "success";
	}

}
