package com.backend.cinema.model;

import javax.persistence.*;

@Entity
@Table(name="room")
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
