package com.backend.cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.cinema.model.Seat;
import com.backend.cinema.model.User;

public interface SeatRepository extends JpaRepository<Seat, Integer>{

}
