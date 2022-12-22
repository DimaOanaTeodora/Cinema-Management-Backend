package com.backend.cinema.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Seat {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int seatId;
	 
	 private int number;
	 
	 Seat(){}

	public Seat(int number) {
		super();
		this.number = number;
	}
	 
}
