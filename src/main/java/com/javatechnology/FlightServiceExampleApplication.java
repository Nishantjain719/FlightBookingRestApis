package com.javatechnology;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatechnology.dto.FlightBookingAcknowledgement;
import com.javatechnology.dto.FlightBookingRequest;
import com.javatechnology.service.FlightBookingService;

@SpringBootApplication
@RestController
@EnableTransactionManagement
public class FlightServiceExampleApplication {

	@Autowired
	private FlightBookingService service;
	
	@PostMapping("/bookflightTicket")
	public FlightBookingAcknowledgement bookflightTicket(@RequestBody FlightBookingRequest request) {
		return service.bookflightTicket(request);
	}
	public static void main(String[] args) {
		SpringApplication.run(FlightServiceExampleApplication.class, args);
	}

}
