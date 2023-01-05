package com.backend.cinema.model;

import javax.persistence.*;

@Entity
@Table(name="seat")
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
