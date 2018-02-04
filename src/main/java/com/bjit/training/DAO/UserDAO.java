package com.bjit.training.DAO;

import java.util.List;

import com.bjit.training.model.User;

public interface UserDAO {
	public void createUser(User user);
	public void deleteUser(String email);
	public void updateUser(Integer userId, User user);
	public User searchUser(String email, String password);
	public List<User> searchAll();
	public User searchByEmail(String email);
	public void updateUserByEmail(User user);
}
