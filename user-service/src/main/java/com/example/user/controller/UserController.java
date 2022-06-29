package com.example.user.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.VO.ResponseTemplate;
import com.example.user.entity.Users;
import com.example.user.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	public UserService userService;
	
	@PostMapping("/")
	public Users saveUser(@RequestBody Users user) {
		return userService.saveUser(user);
	}
	
	@GetMapping("/{id}")
	public ResponseTemplate getUserwithDepartment(@PathVariable("id") Long userId) {
		return userService.getUserwithDepartment(userId);
	}

}
