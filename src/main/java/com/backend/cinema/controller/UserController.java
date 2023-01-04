package com.backend.cinema.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.cinema.dto.UserRequest;
import com.backend.cinema.mapper.UserMapper;
import com.backend.cinema.model.User;
import com.backend.cinema.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.util.*;

import io.swagger.annotations.*;

import org.hibernate.usertype.UserType;
import org.springframework.http.*;

//@RestController
//@Validated
//@RequestMapping("/user")
//


@RestController
@RequestMapping("/users")
@Api(value = "/users",
        tags = "Users")
public class UserController {
	// toate au constructor si response entity

	private UserService userService;
	private UserMapper userMapper;
	
	public UserController(UserService userService, UserMapper userMapper) {
		this.userService = userService;
		this.userMapper = userMapper;
	}
	
	/*@PostMapping
    @ApiOperation(value = "Create a User",
            notes = "Creates a new User based on the information received in the request")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "The User was successfully created based on the received request"),
            @ApiResponse(code = 400, message = "Validation error on the received request")
    })
    public ResponseEntity<User> create(
            @RequestBody
            @ApiParam(name = "user", value = "User details", required = true)
                    UserRequest userRequest) {
        User savedUser = userService.createUser(
                userMapper.userRequestToUser(userRequest));
        return ResponseEntity
                .created(URI.create("/users/" + savedUser.getId()))
                .body(savedUser);
    }*/
	 
	
    @PostMapping
    public ResponseEntity<User> createUser(
            @Valid
            @RequestBody UserRequest userRequest) {
        User user = userMapper.userRequestToUser(userRequest);
        User createdUser = userService.createUser(user);
        return ResponseEntity
                .created(URI.create("/user/" + createdUser.getId()))
                .body(createdUser);
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Integer id) {
        return userService.getUser(id);
    }
//
//    @GetMapping
//    public List<User> getAllByType(@RequestParam UserType type) {
//        return userService.getAllByType(type);
//    }

//    @GetMapping("/averagebalance/{type}")
//    public double getUsersAverageBalance(@PathVariable UserType type) {
//        return userService.getAverageBalance(type);
//    }

    /*@PutMapping
    public void makeUserTransfer(
            @Valid
            @RequestBody
            TransferRequest transferRequest) {
        userService.makeUserTransfer(transferRequest);
    }*/
}
