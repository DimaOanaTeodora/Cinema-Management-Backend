package com.backend.cinema.mapper;

import org.springframework.stereotype.Component;

import com.backend.cinema.dto.UserRequest;
import com.backend.cinema.model.User;

@Component
public class UserMapper {

	 public User userRequestToUser(UserRequest bankAccountRequest) {
		 return null;
	        /*return new User(bankAccountRequest.getAccountNumber(), bankAccountRequest.getBalance(),
	                bankAccountRequest.getType(), bankAccountRequest.getCardNumber());*/
	    }
}
