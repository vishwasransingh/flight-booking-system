package com.flightbookingsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amadeus.resources.FlightOfferSearch;
import com.flightbookingsystem.service.FlightBookingService;

@RestController
public class FlightBookingController {
	
	@Autowired
	FlightBookingService flightBookingService;
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello!";
	}
	
	@GetMapping("/flights")
	public void getFlightOffers() {
		FlightOfferSearch[] flightOffersSearches = flightBookingService.getFlightOffers();
		if (flightOffersSearches != null) {
			for (FlightOfferSearch offer : flightOffersSearches) {
				System.out.println(offer);
			}
		}
		else
			System.out.println("Error Occured.");
		
	}
	
}
