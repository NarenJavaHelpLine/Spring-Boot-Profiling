package com.naren.java.demo.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User {
	int userId;
	String userName;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
