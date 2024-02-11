package com.FlightManagement.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.FlightManagement.entity.Flight;
import com.FlightManagement.repository.FlightRepository;
import com.FlightManagement.service.FlightService;

@Service
public class FlightServiceImpl implements FlightService
{
	private FlightRepository flrepo;

	public FlightServiceImpl(FlightRepository flrepo) {
		super();
		this.flrepo = flrepo;
	}

	public List<Flight> getAllFlight() {
		return flrepo.findAll();
	}

	@Override
	public Flight saveFlight(Flight flight) {
		return flrepo.save(flight);
	}

}
