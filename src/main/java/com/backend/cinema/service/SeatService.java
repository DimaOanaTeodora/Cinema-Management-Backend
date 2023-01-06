package com.backend.cinema.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.backend.cinema.model.Room;
import com.backend.cinema.model.Seat;
import com.backend.cinema.repository.SeatRepository;

@Service
public class SeatService {
	private SeatRepository seatRepository;

	public SeatService(SeatRepository seatRepository) {
	        this.seatRepository = seatRepository;
	    }

	
	public Seat createSeat(Seat seat) {
		return seatRepository.save(seat);
	}

	public Seat getSeat(Integer id) {
		Optional<Seat> seatOptional = seatRepository.findById(id);
		if (seatOptional.isPresent()) {
			return seatOptional.get();
		} else {
			return null;
		}
	}
	
	public List<Seat> createSeats(Room room){
		List<Seat> seats = new ArrayList<Seat>();
		for(int i=1; i<= room.getCapacity(); i++) {
			Seat seat = new Seat(i);
			seat.setRoom(room);
			seats.add(createSeat(seat));
		}
		return seats;
	}
}
