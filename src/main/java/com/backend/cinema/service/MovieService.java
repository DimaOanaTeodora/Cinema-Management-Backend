package com.backend.cinema.service;

import org.springframework.stereotype.Service;

import com.backend.cinema.repository.MovieRepository;

@Service
public class MovieService {

	private MovieRepository movieRepository;

	public MovieService(MovieRepository movieRepository) {
		this.movieRepository = movieRepository;
	}
}
