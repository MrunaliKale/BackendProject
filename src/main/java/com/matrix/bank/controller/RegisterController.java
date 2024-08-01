package com.matrix.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.matrix.bank.dto.Login;
import com.matrix.bank.entity.User;
import com.matrix.bank.service.UserService;

@RestController
public class RegisterController {

	@Autowired
	private UserService userservice;
	

	@PostMapping("/register")
	public ResponseEntity<User> registerUser(@RequestBody User user) {
		User savedUser = userservice.registerUser(user);
		return new ResponseEntity<>(savedUser, HttpStatus.CREATED);		
	}
	
	@PostMapping("/login")
	public ResponseEntity<Login> login(@RequestBody Login login){
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
}
