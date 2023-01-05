package com.backend.cinema.model;

import javax.persistence.*;

@Entity
@Table(name="broadcast")
public class Broadcast {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int broadcastId;
	 
	 
}
