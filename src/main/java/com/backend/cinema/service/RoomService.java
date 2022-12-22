package com.backend.cinema.service;

import org.springframework.stereotype.Service;

import com.backend.cinema.repository.RoomRepository;

@Service
public class RoomService {
	private RoomRepository roomRepository;

	public RoomService(RoomRepository roomRepository) {
		this.roomRepository = roomRepository;
	}
}
