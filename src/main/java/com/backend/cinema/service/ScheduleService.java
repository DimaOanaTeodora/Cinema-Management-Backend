package com.backend.cinema.service;

import org.springframework.stereotype.Service;

import com.backend.cinema.repository.ScheduleRepository;

@Service
public class ScheduleService {
	private ScheduleRepository scheduleRepository;

	public ScheduleService(ScheduleRepository scheduleRepository) {
		this.scheduleRepository = scheduleRepository;
	}
}
