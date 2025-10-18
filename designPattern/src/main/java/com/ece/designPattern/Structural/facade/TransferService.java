package com.ece.designPattern.Structural.facade;

public class TransferService {
	public void transferFunds(String accountFrom, String accountTo, double amount) {
		System.out.println("Funds transferred successfully."+accountFrom + " to " + accountTo + " amount: " + amount);
	}
}
