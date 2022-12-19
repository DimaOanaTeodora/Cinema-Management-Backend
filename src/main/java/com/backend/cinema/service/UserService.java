package com.backend.cinema.service;

import org.springframework.stereotype.Service;

import com.backend.cinema.repository.UserRepository;

@Service
public class UserService {

	private UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
}
