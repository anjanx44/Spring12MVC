package com.bjit.training.services;


import java.util.List;

import com.bjit.training.model.User;

public interface UserService {
	public void addUser(User user);
	public void deleteUser(String email);
	public void updateUser(User user);
	public User getUser(String email, String passowrd);
	public List<User> getAllUser();
	public User getByEmail(String email);
}
