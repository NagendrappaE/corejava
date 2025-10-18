package com.ece.designPattern.Structural.facade;

public class FacadeMainClass {
public static void main(String[] args) {
	
	BankFacade bankFacade = new BankFacade();
	
	bankFacade.getAccountDetails("123456789");
	
    bankFacade.transferFundDetails("123456789", "987654321", 500.0);
    bankFacade.payBill("123456789", "Electricity", 150.0);
}
}
