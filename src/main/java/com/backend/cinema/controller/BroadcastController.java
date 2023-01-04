package com.backend.cinema.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.cinema.service.BroadcastService;

@RestController
@Validated
@RequestMapping("/broadcast")
public class BroadcastController {
private final BroadcastService broadcastService;
	
	public BroadcastController(BroadcastService broadcastService) {
		this.broadcastService = broadcastService;
	}
}
