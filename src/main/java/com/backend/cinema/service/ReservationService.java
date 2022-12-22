package com.backend.cinema.service;

import org.springframework.stereotype.Service;

import com.backend.cinema.repository.ReservationRepository;

@Service
public class ReservationService {
	private ReservationRepository reservationRepository;

	public ReservationService(ReservationRepository reservationRepository) {
		this.reservationRepository = reservationRepository;
	}
}
