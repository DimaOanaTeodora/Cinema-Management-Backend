package com.backend.cinema.service;

import org.springframework.stereotype.Service;

import com.backend.cinema.repository.SeatRepository;

@Service
public class SeatService {
	private SeatRepository seatRepository;

	public SeatService(SeatRepository seatRepository) {
		this.seatRepository = seatRepository;
	}
}
