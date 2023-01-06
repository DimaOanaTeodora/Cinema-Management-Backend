package com.backend.cinema.dto;

import java.time.LocalTime;
import java.util.Date;

import javax.validation.constraints.NotBlank;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Schedule request", description = "Required details needed to create a new schedule")
public class ScheduleRequest {

	@NotBlank(message = "Starting hour cannot be null")
	@ApiModelProperty(value = "startingHour", required = true, notes = "The starting hour of the movie", example = "10:00", position = 1)
	private LocalTime startingHour;

	@NotBlank(message = "Ending hour cannot be null")
	@ApiModelProperty(value = "endingHour", required = true, notes = "The ending hour of the movie", example = "12:00", position = 2)
	private LocalTime endingHour;

	@NotBlank(message = "Date cannot be null")
	@ApiModelProperty(value = "date", required = true, notes = "The date of the movie", example = "05/07/2023", position = 3)
	private Date date;

	public ScheduleRequest() {
	}

	public ScheduleRequest(@NotBlank(message = "Starting hour cannot be null") LocalTime startingHour,
			@NotBlank(message = "Ending hour cannot be null") LocalTime endingHour,
			@NotBlank(message = "Date cannot be null") Date date) {
		this.startingHour = startingHour;
		this.endingHour = endingHour;
		this.date = date;
	}

	public LocalTime getStartingHour() {
		return startingHour;
	}

	public void setStartingHour(LocalTime startingHour) {
		this.startingHour = startingHour;
	}

	public LocalTime getEndingHour() {
		return endingHour;
	}

	public void setEndingHour(LocalTime endingHour) {
		this.endingHour = endingHour;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
