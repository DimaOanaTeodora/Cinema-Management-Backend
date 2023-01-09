package com.backend.cinema.mapper;

import org.springframework.stereotype.Component;

import com.backend.cinema.dto.BroadcastRequest;
import com.backend.cinema.model.Broadcast;

@Component
public class BroadcastMapper {

	private RoomMapper roomMapper;// = new RoomMapper();
	private MovieMapper movieMapper; // = new MovieMapper();
	private ScheduleMapper scheduleMapper; // = new ScheduleMapper();

	public BroadcastMapper(RoomMapper roomMapper, MovieMapper movieMapper, ScheduleMapper scheduleMapper) {
		this.roomMapper = roomMapper;
		this.movieMapper = movieMapper;
		this.scheduleMapper = scheduleMapper;
	}

	public Broadcast broadcastRequestToBroadcast(BroadcastRequest broadcastRequest) {

		return new Broadcast(roomMapper.roomRequestToRoom(broadcastRequest.getRoom()),
				movieMapper.movieRequestToMovie(broadcastRequest.getMovie()),
				scheduleMapper.scheduleRequestToSchedule(broadcastRequest.getSchedule()));
	}
}
