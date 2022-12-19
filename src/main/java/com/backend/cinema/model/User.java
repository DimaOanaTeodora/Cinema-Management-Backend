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
	 
	 /*
	  * @ManyToOne
    @JoinColumn(name = "artist_id")
    private Artist artist;
	  * */

	 public User() {}
	 public User(String email) {
		 this.email = email;
	 }
}
