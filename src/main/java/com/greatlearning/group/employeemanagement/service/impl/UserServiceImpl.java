package com.greatlearning.group.employeemanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.group.employeemanagement.model.User;
import com.greatlearning.group.employeemanagement.repository.UserRepository;
import com.greatlearning.group.employeemanagement.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}
	
	@Override
	public User getUserByUsername(String username) {
		return userRepository.findById(username).get();
	}
	
	@Override
	public void addUser(User user) {
		userRepository.save(user);
	}
}
