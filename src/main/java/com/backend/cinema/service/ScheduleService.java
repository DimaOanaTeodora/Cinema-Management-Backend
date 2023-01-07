package com.backend.cinema.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.backend.cinema.exception.ScheduleNotFoundException;
import com.backend.cinema.model.Schedule;
import com.backend.cinema.repository.ScheduleRepository;

@Service
public class ScheduleService {
	private ScheduleRepository scheduleRepository;

	public ScheduleService(ScheduleRepository scheduleRepository) {
		this.scheduleRepository = scheduleRepository;
	}

	public Schedule createSchedule(Schedule schedule) {
		return scheduleRepository.save(schedule);
	}

	public Schedule getSchedule(Integer id) {
		Optional<Schedule> scheduleOptional = scheduleRepository.findById(id);
		if (scheduleOptional.isPresent()) {
			return scheduleOptional.get();
		} else {
			throw new ScheduleNotFoundException(id);
		}
	}

}
