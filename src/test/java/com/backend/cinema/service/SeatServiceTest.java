package com.backend.cinema.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.backend.cinema.model.Seat;
import com.backend.cinema.repository.SeatRepository;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class SeatServiceTest {

    @InjectMocks
    private SeatService seatService;

    @Mock
    private SeatRepository seatRepository;


    @Test
    void whenSeatDoesntExist_create_savesTheSeat() {
        // Arrange
        Seat seat = new Seat();
        seat.setNumber(1);
        when(seatRepository.findByNumber(seat.getNumber()))
                .thenReturn(null);
        
        Seat savedSeat = new Seat();
        savedSeat.setNumber(1);
        savedSeat.setId(1);
        when(seatRepository.save(seat)).thenReturn(savedSeat);

        // Act
        Seat result = seatService.createSeat(seat);

        // Assert
        assertNotNull(result);
        assertEquals(savedSeat.getId(), result.getId());
        assertEquals(savedSeat.getNumber(), result.getNumber());
        
        //verify(seatRepository).findByNumber(seat.getNumber());
        verify(seatRepository).save(seat);
    }

    @Test
    void whenSeatExists_findById_returnsTheSeat() {
        // Arrange
        Seat seat = new Seat();
        seat.setId(1);
        
        when(seatRepository.findById(1)).thenReturn(Optional.of(seat));

        // Act
        Seat result = seatService.getSeat(1);

        // Assert
        assertNotNull(result);
        assertTrue(result != null);
        assertEquals(seat.getId(), result.getId());
    }

    @Test
    void whenSeatDoesntExists_findById_returnsEmptyOptional() {
        // Arrange
        when(seatRepository.findById(1)).thenReturn(Optional.empty());
        // Act
        Seat result = seatService.getSeat(1);

        // Assert
        assertNotNull(result);
        assertTrue(result == null);
    }
}
