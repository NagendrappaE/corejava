package com.ece.designPattern.behaviouralDs.StateDesign;

public interface VendingState {
	
	public void insertCoin(VendingMachine vendingMachine);
	
	public void dispenseItem(VendingMachine vendingMachine);

}
