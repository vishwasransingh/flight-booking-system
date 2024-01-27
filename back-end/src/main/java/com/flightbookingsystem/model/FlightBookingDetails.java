package com.flightbookingsystem.model;

import lombok.Data;

@Data
public class FlightBookingDetails {
	
	private String originLocationCode;
    private String destinationLocationCode;
    private String departureDate;
    private String returnDate;
    private int adults;
    private int max;
	
}
