package com.javatechnology.service;

import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatechnology.dto.FlightBookingAcknowledgement;
import com.javatechnology.dto.FlightBookingRequest;
import com.javatechnology.entity.PassengerInfo;
import com.javatechnology.entity.PaymentInfo;
import com.javatechnology.repository.PassengerInfoRepository;
import com.javatechnology.repository.PaymentInfoRepository;
import com.javatechnology.utils.PaymetUtils;

@Service
public class FlightBookingService {

	@Autowired
	private PassengerInfoRepository passengerInfoRepository;
	
	@Autowired
	private PaymentInfoRepository paymentInfoRepository;
	
	@Transactional()
	public FlightBookingAcknowledgement bookflightTicket(FlightBookingRequest request) {
		
		PassengerInfo passengerInfo = request.getPassengerInfo();
		passengerInfoRepository.save(passengerInfo);
		
		PaymentInfo paymentInfo = request.getPaymentInfo();
		PaymetUtils.validateCreditLimit(paymentInfo.getAccountNo(), passengerInfo.getFare());
		paymentInfo.setPassengerId(passengerInfo.getPId());
		paymentInfo.setAmount(passengerInfo.getFare());
		paymentInfoRepository.save(paymentInfo);
		return new FlightBookingAcknowledgement("SUCCESS", passengerInfo.getFare(), UUID.randomUUID().toString().split("-")[0], passengerInfo);
	}
}
