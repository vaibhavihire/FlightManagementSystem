package com.FlightManagement.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Flight {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String runway_name;
	
	
	public Flight(int id, String name, String runway_name) {
		super();
		this.id = id;
		this.name = name;
		this.runway_name = runway_name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRunway_name() {
		return runway_name;
	}
	public void setRunway_name(String runway_name) {
		this.runway_name = runway_name;
	}
	
	public Flight() {
		super();
		
	}

}
