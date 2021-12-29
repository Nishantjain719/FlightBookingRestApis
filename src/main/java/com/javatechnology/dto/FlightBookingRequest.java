package com.javatechnology.dto;

import com.javatechnology.entity.PassengerInfo;
import com.javatechnology.entity.PaymentInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingRequest {

	private PassengerInfo passengerInfo;
	private PaymentInfo paymentInfo;
}
