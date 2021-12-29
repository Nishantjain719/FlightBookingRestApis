package com.javatechnology.dto;

import com.javatechnology.entity.PassengerInfo;
import com.javatechnology.entity.PaymentInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingAcknowledgement {

	private String status;
	private double totalFare;
	private String pnrNo;
	private PassengerInfo passengerInfo;
	
}
