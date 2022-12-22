package com.backend.cinema.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.cinema.service.SeatService;

@RestController
@RequestMapping("/seat")
public class SeatController {
private final SeatService seatService;
	
	public SeatController(SeatService seatService) {
		this.seatService = seatService;
	}
}
