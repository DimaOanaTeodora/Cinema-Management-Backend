package com.backend.cinema.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Reservation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int reservationId;
	
	private Integer noPersons;
	
	Reservation(){}

	public Reservation(Integer noPersons) {
		super();
		this.noPersons = noPersons;
	}
	
}
