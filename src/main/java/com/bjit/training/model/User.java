package com.bjit.training.model;

import java.util.List;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class User {

	@Size(max = 20, min = 3, message = "Name entered is invalid. It must be between {2} and {1} characters.")
	private String name;
	
	@Digits(fraction = 0, integer = 2, message = "Invalid age.")
	private Integer age;

	@Size(max = 50, min = 3, message = "Address is invalid. It must be between {2} and {1} characters.")
	private String address;

	@NotEmpty(message = "Select Gender.")
	private String gender;

	@Email(message = "Invalid email! Please enter valid email.")
	private String email;

	@Size(max = 10, min = 4, message = "Invalid password. It must be between {2} and {1} characters.")
	private String password;

	@NotEmpty(message = "Select Gender.")
	private String type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


	
}