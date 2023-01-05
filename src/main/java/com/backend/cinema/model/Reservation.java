package com.backend.cinema.model;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "reservation")
public class Reservation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private Integer noPersons;
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Date dateRegistered;

	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
	private User user;
	
	@ManyToMany
    private List<Seat> reservedSeats;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "broadcast_id", referencedColumnName = "id")
    private Broadcast broadcast;

	Reservation() {
	}

	public Reservation(Integer noPersons, Date dateRegistered) {
		this.noPersons = noPersons;
		this.dateRegistered = dateRegistered;
	}

	@Override
	public String toString() {
		return "Reservation [id=" + id + ", noPersons=" + noPersons + ", dateRegistered=" + dateRegistered + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getNoPersons() {
		return noPersons;
	}

	public void setNoPersons(Integer noPersons) {
		this.noPersons = noPersons;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getDateRegistered() {
		return dateRegistered;
	}

	public void setDateRegistered(Date dateRegistered) {
		this.dateRegistered = dateRegistered;
	}

}
