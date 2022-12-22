package com.backend.cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.cinema.model.Reservation;
import com.backend.cinema.model.User;

public interface ReservationRepository extends JpaRepository<Reservation, Integer>{

}
