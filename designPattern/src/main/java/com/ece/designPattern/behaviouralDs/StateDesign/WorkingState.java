package com.ece.designPattern.behaviouralDs.StateDesign;

public class WorkingState implements VendingState {

	@Override
	public void insertCoin(VendingMachine vendingMachine) {
		System.out.println("Coin inserted successfully.");
	}

	@Override
	public void dispenseItem(VendingMachine vendingMachine) {
		System.out.println("Item dispensed successfully.");
		vendingMachine.setMachineState(new IdleState());
	}


}
