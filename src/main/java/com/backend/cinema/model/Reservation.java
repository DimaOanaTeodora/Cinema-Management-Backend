package com.backend.cinema.model;

import javax.persistence.*;

@Entity
@Table(name="reservation")
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
