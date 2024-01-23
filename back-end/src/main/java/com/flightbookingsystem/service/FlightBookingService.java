package com.flightbookingsystem.service;

import org.springframework.stereotype.Service;

import com.amadeus.Amadeus;
import com.amadeus.Params;
import com.amadeus.exceptions.ResponseException;
import com.amadeus.resources.FlightOfferSearch;

@Service
public class FlightBookingService {

	Amadeus amadeus;
	
	private FlightBookingService(Amadeus amadeus) {
		this.amadeus = amadeus;
	}
	
	public FlightOfferSearch[] getFlightOffers() {
		
		FlightOfferSearch[] flightOffersSearches = null;
		
		try {
			flightOffersSearches = amadeus.shopping.flightOffersSearch.get(
			          Params.with("originLocationCode", "SYD")
			                  .and("destinationLocationCode", "BKK")
			                  .and("departureDate", "2024-02-02")
			                  .and("returnDate", "2024-03-08")
			                  .and("adults", 2)
			                  .and("max", 3));
		} catch (ResponseException e) {
			e.printStackTrace();
		}
		
		return flightOffersSearches;
	}

}
