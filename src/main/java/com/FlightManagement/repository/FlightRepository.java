package com.FlightManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FlightManagement.entity.Flight;

@Repository

public interface FlightRepository extends JpaRepository<Flight,Integer>{

}
