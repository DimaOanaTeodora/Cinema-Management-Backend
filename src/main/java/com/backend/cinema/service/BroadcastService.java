package com.backend.cinema.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.backend.cinema.exception.BroadcastNotFoundException;
import com.backend.cinema.model.Broadcast;
import com.backend.cinema.repository.BroadcastRepository;

@Service
public class BroadcastService {

	private BroadcastRepository broadcastRepository;

	public BroadcastService(BroadcastRepository broadcastRepository) {
		this.broadcastRepository = broadcastRepository;
	}

	public Broadcast createBroadcast(Broadcast broadcast) {
		return broadcastRepository.save(broadcast);
	}

	public Broadcast getBroadcast(Integer id) {
		Optional<Broadcast> broadcastOptional = broadcastRepository.findById(id);
		if (broadcastOptional.isPresent()) {
			return broadcastOptional.get();
		} else {
			throw new BroadcastNotFoundException(id);
		}
	}

	

}
