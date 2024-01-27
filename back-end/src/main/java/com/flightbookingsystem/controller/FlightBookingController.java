package com.flightbookingsystem.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amadeus.resources.FlightOfferSearch;
import com.flightbookingsystem.model.FlightBookingDetails;
import com.flightbookingsystem.service.FlightBookingService;

@RestController
public class FlightBookingController {
	
	@Autowired
	FlightBookingService flightBookingService;
	
//	@GetMapping("/offers")
//	public void getFlightOffers() {
//		FlightOfferSearch[] flightOffersSearches = flightBookingService.getFlightOffers();
//		if (flightOffersSearches != null) {
//			for (FlightOfferSearch offer : flightOffersSearches) {
//				System.out.println(offer);
//			}
//		}
//		else
//			System.out.println("Error Occured.");
//		
//	}
	
//	@GetMapping("/offers")
//    public ResponseEntity<FlightOfferSearch[]> getFlightOffers() {
//		FlightOfferSearch[] flightOffersSearches = flightBookingService.getFlightOffers();
//		if (flightOffersSearches != null) {
//			for (FlightOfferSearch offer : flightOffersSearches) {
//				System.out.println(offer);
//			}
//		}
//		else
//			System.out.println("Error Occured.");
//        return ResponseEntity.ok(flightOffersSearches);
//    }
	
//	@PostMapping("/offers")
//    public /*ResponseEntity<List<FlightOfferSearch>>*/ void getFlightOffers(@RequestBody FlightBookingDetails details) {
//		
//		List<FlightOfferSearch> flightOffers = flightBookingService.getFlightOffers(details);
//        for(FlightOfferSearch flight : flightOffers) {
//        	System.out.println(flight + "\n");
//        }
//        //return ResponseEntity.ok(flightOffers);
//    }
	
	@PostMapping("/offers")
    public /*ResponseEntity<List<FlightOfferSearch>>*/ void getFlightOffers() {
		FlightBookingDetails details = new FlightBookingDetails();
		details.setOriginLocationCode("SYD");
		details.setDestinationLocationCode("BKK");
		details.setDepartureDate("2024-02-02");
		details.setReturnDate("2024-03-08");
		details.setAdults(2);
		details.setMax(3);
		
		List<FlightOfferSearch> flightOffers = flightBookingService.getFlightOffers(details);
        for(FlightOfferSearch flight : flightOffers) {
        	System.out.println(flight + "\n");
        }
        //return ResponseEntity.ok(flightOffers);
    }
	
}
