package com.ece.designPattern.Structural.decorator;

public class BankCodeService {
	public boolean exists(String bic) {
		// Simulate a database lookup for the BIC code
		// In a real application, this would query a database or an external service
		return bic != null && bic.length() == 8; // Example condition: BIC must be 8 characters long
	}
}
