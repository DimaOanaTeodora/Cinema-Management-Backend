package com.backend.cinema.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Movie {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int movieId;
	 
	 private String name;
	 
	 private String type;
	 
	 Movie(){}

	 public Movie(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	 }
	 
	 
}
