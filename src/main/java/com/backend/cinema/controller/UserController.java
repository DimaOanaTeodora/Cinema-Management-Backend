package com.backend.cinema.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.cinema.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	// toate au constructor si response entity

	private final UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	/*@GetMapping
    public ResponseEntity<List<User>> getUsers() {
        return ResponseEntity.ok().body(userService.getUsers());
    }*/
}
