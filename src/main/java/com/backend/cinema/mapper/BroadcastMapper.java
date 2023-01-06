package com.backend.cinema.mapper;

import org.springframework.stereotype.Component;

import com.backend.cinema.dto.BroadcastRequest;
import com.backend.cinema.model.Broadcast;

@Component
public class BroadcastMapper {

	public Broadcast broadcastRequestToBroadcast(BroadcastRequest broadcastRequest) {

		return new Broadcast();
	}
}
