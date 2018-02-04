package com.bjit.training;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.bjit.training.model.Student;
import com.bjit.training.model.User;
import com.bjit.training.services.UserService;

@Controller
@SessionAttributes("user")
public class LoginController {
	/*
	 * Add student in model attribute
	 */

	public static ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

	@ModelAttribute("student")
	public Student setUpStudentForm1() {
		return new Student();
	}
	
	@ModelAttribute("user")
	public User setUpUserForm1() {
		return new User();
	}

	@GetMapping("/login2")
	public String index() {
		return "login2";
	}
	
	@PostMapping("/dologin2")
	public String doLogin2(@ModelAttribute("user") User user, Model model) {

		UserService adminUser = (UserService) ctx.getBean("adminUser");

		User user2 = new User();
		user2 = adminUser.getUser(user.getEmail(), user.getPassword());

		if (user2==null) {
			
			model.addAttribute("message", "Login failed. Try again.");
			return "login";
			
		} 
		
		user.setName(user2.getName());
		user.setAddress(user2.getAddress());
		user.setAge(user2.getAge());
		user.setGender(user2.getGender());
		user.setEmail(user2.getEmail());
		user.setType(user2.getType());

		if (user2.getType().equals("admin")) {
		System.out.println("Anjan ");
			return "info";
		} else {
			return "success";
		}

	}
	
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String sendDelete (@RequestParam("email") String email,Model model) {
		UserService adminUser = (UserService) ctx.getBean("adminUser");
		adminUser.deleteUser(email);
		return "abx";
	}
	
	@RequestMapping(value="/updateUser", method=RequestMethod.POST)
	public String updateData (@ModelAttribute("updateUser")User user,Model model) {
		UserService adminUser = (UserService) ctx.getBean("adminUser");
		adminUser.updateUser(user);
		List<User>userList = adminUser.getAllUser();
		model.addAttribute("userList", userList);
		return "userList";
	}
	
	
	@RequestMapping(value="/update", method=RequestMethod.GET)
	public String Update (@RequestParam("email") String email,Model model) {
		UserService adminUser = (UserService) ctx.getBean("adminUser");
		User updateUser = adminUser.getByEmail(email);
		model.addAttribute("email", email);
		model.addAttribute("updateUser", updateUser);
		return "updateUser";
	}

	@PostMapping("/dologin")
	public String doLogin(@ModelAttribute("user") Student student, Model model) {

		 // Implement your business logic
		 if (student.getEmail().equals("JohnDue@bjit.com") &&
		 student.getPassword().equals("123456")) {
		 // Set student dummy data
		 student.setName("John Due");
		 student.setEmail("JohnDue@bjit.com");
		 student.setId(1);
		 student.setAge(37);
		 } else {
		 model.addAttribute("message", "Login failed. Try again.");
		 return "login";
		 }
		 return "success";
	}
	
	@RequestMapping(value = "/info", method = RequestMethod.GET)
	public String studentInfo(@SessionAttribute("user") User user) {
		System.out.println("Email: " + user.getEmail());
		System.out.println("Name: " + user.getName());
		return "normalUser";
	}
}