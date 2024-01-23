package com.flightbookingsystem.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amadeus.Amadeus;

@Configuration
public class AmadeusConfig {
	
	@Value("${amadeus.api.key}")
    private String amadeusApiKey;

    @Value("${amadeus.api.secret}")
    private String amadeusApiSecret;
    
    @Bean
    public Amadeus amadeus() {
        return Amadeus.builder(amadeusApiKey, amadeusApiSecret).build();
    }
	
}
