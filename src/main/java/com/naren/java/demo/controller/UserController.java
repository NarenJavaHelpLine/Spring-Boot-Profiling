package com.naren.java.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naren.java.demo.model.User;
import com.naren.java.demo.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;

	@GetMapping("/allUsers")
	public List<User> getAllUsers() {
		return userService.getAllUsers();

	}

}
