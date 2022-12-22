package com.backend.cinema.model;

import java.time.LocalTime;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Schedule {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sheduleId;

	@JsonFormat(pattern = "HH:mm")
	private LocalTime startingHour;

	@JsonFormat(pattern = "HH:mm")
	private LocalTime endingHour;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	private Date date;

	Schedule() {}

	public Schedule(LocalTime startingHour, LocalTime endingHour, Date date) {
		super();
		this.startingHour = startingHour;
		this.endingHour = endingHour;
		this.date = date;
	}
	

}
