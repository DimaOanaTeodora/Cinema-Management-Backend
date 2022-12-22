package com.backend.cinema.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Room {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int roomId;
	 
	 private int number;
	 
	 private int capacity;
	 
	 Room(){}

	public Room(int number, int capacity) {
		super();
		this.number = number;
		this.capacity = capacity;
	}
	 
	 
}
