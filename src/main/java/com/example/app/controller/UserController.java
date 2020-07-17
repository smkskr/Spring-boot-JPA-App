package com.example.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.entity.User;
import com.example.app.service.UserDAOService;

@RestController
public class UserController {
	
	@Autowired
	private UserDAOService userDAOService;
	
	/**
	 * Add a user
	 * @param user
	 * @return
	 */
	@PostMapping("/addUser")
	public String addUser(@RequestBody User user) {
		userDAOService.saveUser(user);
		return "Success";
	}

}
