package com.ece.designPattern.Structural.facade;

public class BillPaymentService {

	public void payBill(String accountNumber, String billType, double amount) {
		System.out.println("Bill payment processed successfully" + " for account: " + accountNumber + ", bill type: "
				+ billType + ", amount: " + amount);
	}
}
