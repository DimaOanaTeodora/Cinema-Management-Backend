package com.backend.cinema.exception;

public class MovieNotFoundException extends RuntimeException {
	public MovieNotFoundException(int id) {
		super("Moovie with id " + id + " doesn't exist ");
	}
}
