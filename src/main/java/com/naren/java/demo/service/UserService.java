package com.naren.java.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naren.java.demo.model.User;
import com.naren.java.demo.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository repo;

	public List<User> getAllUsers() {
		return repo.findAll();
	}
}
