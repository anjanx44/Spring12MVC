package com.bjit.training.services;


import java.util.List;

import com.bjit.training.DAO.UserDAO;
import com.bjit.training.model.User;

public class UserServiceImpl implements UserService{

	private UserDAO userDAO;

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public void addUser(User user) {
		userDAO.createUser(user);
	}

	public void deleteUser(String email) {
		// TODO Auto-generated method stub
		userDAO.deleteUser(email);
		
	}

	public void updateUser(User user) {
		// TODO Auto-generated method stub
		userDAO.updateUserByEmail(user);
		
	}

	public User getUser(String email, String password) {
		return userDAO.searchUser(email, password);
	}

	public List<User>  getAllUser() {
		
		return userDAO.searchAll();
	}

	public User getByEmail(String email) {
		// TODO Auto-generated method stub
		return userDAO.searchByEmail(email);
	}
	
	

}
