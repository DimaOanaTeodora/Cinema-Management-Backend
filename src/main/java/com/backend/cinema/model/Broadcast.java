package com.backend.cinema.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Broadcast {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int broadcastId;
	 
	 
}
