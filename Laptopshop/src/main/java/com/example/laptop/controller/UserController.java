package com.example.laptop.controller;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.laptop.model.User;
import com.example.laptop.service.UserService;


@RestController
@RequestMapping("/api/v1/")
public class UserController {

	@Autowired
	private UserService userService;
		
		public UserController(UserService userService) {
		super();
		this.userService = userService;
	}

	@PostMapping("/createUser")
	public ResponseEntity<User> addUser(@RequestBody User user) {
		
		return new ResponseEntity<User>(userService.addUser(user),HttpStatus.CREATED);
	}
		//get all user
		@GetMapping
		
		public List<User> getALLUser(){
			return userService.getAllUser();
		}	
}
