package com.backend.cinema.model;

import javax.persistence.*;

@Entity
@Table(name="movie")
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
