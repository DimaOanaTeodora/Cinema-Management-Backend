package com.backend.cinema.service;

import org.springframework.stereotype.Service;

import com.backend.cinema.repository.BroadcastRepository;

@Service
public class BroadcastService {

	private BroadcastRepository broadcastRepository;

	public BroadcastService(BroadcastRepository broadcastRepository) {
		this.broadcastRepository = broadcastRepository;
	}
}
