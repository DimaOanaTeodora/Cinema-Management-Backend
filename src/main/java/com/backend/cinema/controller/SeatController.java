package com.backend.cinema.controller;

import java.net.URI;
import java.util.Dictionary;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.cinema.dto.SeatRequest;
import com.backend.cinema.mapper.SeatMapper;
import com.backend.cinema.model.Broadcast;
import com.backend.cinema.model.Reservation;
import com.backend.cinema.model.Room;
import com.backend.cinema.model.Seat;
import com.backend.cinema.service.BroadcastService;
import com.backend.cinema.service.ReservationService;
import com.backend.cinema.service.SeatService;
import com.backend.cinema.service.SeatService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/seats")
@Api(value = "/seats", tags = "Seats")
public class SeatController {

	private SeatService seatService;
	private ReservationService reservationService;

	public SeatController(SeatService seatService, ReservationService reservationService) {
		this.seatService = seatService;
		this.reservationService = reservationService;
	}

	@GetMapping(path = "/{broadcastId}", produces = { MediaType.APPLICATION_JSON_VALUE })
	@ApiOperation(value = "Get the free seats", notes = "Get the list of free seats for a certain broadcast based on the broadcast id")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "The seat was found"),
			@ApiResponse(code = 404, message = "The seat was not found") })
	public ResponseEntity<Dictionary<Room, List<Seat>>> getSeat(@PathVariable Integer broadcastId) {
		List<Reservation> reservations = reservationService.getAllReservationsByBroadcast(broadcastId);
		return ResponseEntity.ok().body(seatService.getFreeSeats(reservations));
	}

}
