package com.greatlearning.group.employeemanagement.service;

import java.util.List;

import com.greatlearning.group.employeemanagement.model.User;

public interface UserService {
	List<User> getAllUsers();
	User getUserByUsername(String username);
	void addUser(User user);
}