package com.naren.java.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.naren.java.demo.model.User;

public interface UserRepository  extends MongoRepository<User, Integer>{

}
