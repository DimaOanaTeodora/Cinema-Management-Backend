package com.backend.cinema.model;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "room")
public class Room {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private int number;
	private int capacity;

	@OneToMany(mappedBy = "room")
	//@JsonIgnore 
	private List<Seat> seats;

	@OneToMany(mappedBy = "room")
	@JsonIgnore 
	private List<Broadcast> broadcasts;

	Room() {
	}

	public Room(int number, int capacity) {
		this.number = number;
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Room [id=" + id + ", number=" + number + ", capacity=" + capacity + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public List<Seat> getSeats() {
		return seats;
	}

	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}

	public List<Broadcast> getBroadcasts() {
		return broadcasts;
	}

	public void setBroadcasts(List<Broadcast> broadcasts) {
		this.broadcasts = broadcasts;
	}

}
