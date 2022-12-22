package com.backend.cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.cinema.model.Room;
import com.backend.cinema.model.User;

public interface RoomRepository extends JpaRepository<Room, Integer>{

}
