package com.bjit.training;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bjit.training.model.User;

@Controller
public class HelloWebController {
	
	@ModelAttribute("user")
	public User setUpUserForm1() {
		return new User();
	}
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printHello(Model model) {
		model.addAttribute("message", "Hello Spring MVC Framework!");
		return "login2";
	}

}
