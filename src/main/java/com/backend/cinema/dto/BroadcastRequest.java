package com.backend.cinema.dto;

import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Broadcast request", description = "Required details needed to create a new broadcast")
public class BroadcastRequest {

	@NotNull(message = "Room cannot be null")
	@ApiModelProperty(value = "room", required = true, notes = "The room of the broadcast", example = "D2", position = 1)
	private RoomRequest room;

	@NotNull(message = "Movie cannot be null")
	@ApiModelProperty(value = "Movie", required = true, notes = "The movie", example = "D2", position = 2)
	private MovieRequest movie;

	@NotNull(message = "Schedule cannot be null")
	@ApiModelProperty(value = "schedule", required = true, notes = "The schedule of the movie", example = "D2", position = 3)
	private ScheduleRequest schedule;

	public BroadcastRequest() {
	}

	public BroadcastRequest(@NotNull(message = "Room cannot be null") RoomRequest room,
			@NotNull(message = "Movie cannot be null") MovieRequest movie,
			@NotNull(message = "Schedule cannot be null") ScheduleRequest schedule) {
		this.room = room;
		this.movie = movie;
		this.schedule = schedule;
	}

	public RoomRequest getRoom() {
		return room;
	}

	public void setRoom(RoomRequest room) {
		this.room = room;
	}

	public MovieRequest getMovie() {
		return movie;
	}

	public void setMovie(MovieRequest movie) {
		this.movie = movie;
	}

	public ScheduleRequest getSchedule() {
		return schedule;
	}

	public void setSchedule(ScheduleRequest schedule) {
		this.schedule = schedule;
	}

}
