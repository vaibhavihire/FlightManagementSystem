package com.FlightManagement.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import com.FlightManagement.entity.Flight;
import com.FlightManagement.service.FlightService;

@Controller
public class Flightcontroller {

    private FlightService flser;

    @Autowired
    public Flightcontroller(FlightService flser) {
        this.flser = flser;
    }

    @GetMapping("/home")
    public String home() {
        return "home"; // Updated: Removed leading "/" from the view name
    }

    @GetMapping("/available_flight")
    public String listFlight(Model mod){
        mod.addAttribute("Flight", FlightService.getAllFlight()); // Updated: Used flser instead of FlightService
        return "flightlist"; // Updated: Removed leading "/" from the view name
    }

    @GetMapping("/flight_register")
    public String flightregister() {
        return "flightregister";
    }

    @GetMapping("/all_flight")
    public ModelAndView getAllflight() { // Updated: Changed the return type to ModelAndView
        List<Flight> list = FlightService.getAllFlight();
        return new ModelAndView("flightlist", "flightmanagement", list);
    }

    @PostMapping("/save")
    public String addFlight(@ModelAttribute Flight f) {
        FlightService.save(f);
        return "redirect:/available_flight"; // Updated: Added "/" before the view name
    }

    @GetMapping("/booked_flight")
    public String getbookedflight() {
        return "bookedflight";
    }
}
