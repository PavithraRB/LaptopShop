package com.example.laptop.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.laptop.model.User;
import com.example.laptop.repository.UserRepository;
import com.example.laptop.service.UserService;

public class UserServiceImpl implements UserService  {
	@Autowired
	private UserRepository userRepository;

	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}
	
	@Override
	public User LoginUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}
}
