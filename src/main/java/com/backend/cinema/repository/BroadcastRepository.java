package com.backend.cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.cinema.model.Broadcast;
import com.backend.cinema.model.User;

public interface BroadcastRepository extends JpaRepository<Broadcast, Integer>{{

}
