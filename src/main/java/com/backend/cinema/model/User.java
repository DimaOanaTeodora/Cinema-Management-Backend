package com.backend.cinema.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int userId;
	 
	 private String email;
	 
	 private String lastName;
	 
	 private String firstName;
	 
	 private String password;
	 
	 /*
	  * @ManyToOne
    @JoinColumn(name = "artist_id")
    private Artist artist;
	  * */

	public User() {}

	public User(String email, String lastName, String firstName, String password) {
		super();
		this.email = email;
		this.lastName = lastName;
		this.firstName = firstName;
		this.password = password;
	}
	 
}
