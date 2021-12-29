package com.javatechnology.utils;

import java.util.HashMap;
import java.util.Map;

import com.javatechnology.exception.InsufficientAmountException;

public class PaymetUtils {

	private static Map<String, Double> paymentMap = new HashMap<>();
	static {
		paymentMap.put("acc1", 2300.0);
		paymentMap.put("acc2", 5000.0);
		paymentMap.put("acc3", 7000.0);
		paymentMap.put("acc4", 800.0);
	}
	
	public static boolean validateCreditLimit(String accNo, double paidAmount) {
		if (paidAmount > paymentMap.get(accNo)) {
			throw new InsufficientAmountException("insufficient fund..!");
		}else {
			return true;
		}
	}
}
