package com.example.laptop.service;

import java.util.List;

import com.example.laptop.model.User;

public interface UserService {
	User addUser(User user);
	User LoginUser(User user);
	List<User> getAllUser();
}
