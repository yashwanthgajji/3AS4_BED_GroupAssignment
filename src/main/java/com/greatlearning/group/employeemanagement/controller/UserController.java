package com.greatlearning.group.employeemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.group.employeemanagement.model.User;
import com.greatlearning.group.employeemanagement.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public List<User> displayAllUsers() {
		return userService.getAllUsers();
	}
	
	@GetMapping("users/{username}")
	public User displayUserByUsername(@PathVariable("username") String username) {
		return userService.getUserByUsername(username);
	}
	
	@PostMapping("/users/add")
	public String addNewUser(@RequestBody User user) {
		userService.addUser(user);
		return "User added";
	}
}
