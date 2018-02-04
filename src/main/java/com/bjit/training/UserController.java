package com.bjit.training;

import java.util.List;

import javax.validation.Valid;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bjit.training.model.User;
import com.bjit.training.services.UserService;

@Controller
public class UserController {

	public static ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

	@GetMapping("/user")
	public String userForm(Model model) {
		model.addAttribute("user", new User());
		return "userForm";
	}
	
	@GetMapping("/viewUser")
	public String viewAll(Model model) {
		UserService adminUser = (UserService) ctx.getBean("adminUser");
		List<User>userList = adminUser.getAllUser();
		model.addAttribute("userList", userList);
		return "userList";
	}

	@PostMapping("/saveUser")
	public String saveUser(@ModelAttribute("user") @Valid User user, BindingResult result, Model model) {

		if (result.hasErrors()) {
			System.out.println("got you");
			return "userForm";
		}
		
		// Database Operation
		UserService adminUser = (UserService) ctx.getBean("adminUser");
		adminUser.addUser(user);
		
		return "uservalid";
	}
}