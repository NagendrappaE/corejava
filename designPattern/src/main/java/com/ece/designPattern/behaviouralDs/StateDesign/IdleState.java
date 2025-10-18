package com.ece.designPattern.behaviouralDs.StateDesign;

public class IdleState implements VendingState {

	@Override
	public void insertCoin(VendingMachine vendingMachine) {
		System.out.println("Coin inserted. Transitioning to Dispensing State.");
		vendingMachine.setMachineState(new WorkingState());
	}

	@Override
	public void dispenseItem(VendingMachine vendingMachine) {
		System.out.println("Cannot dispense item. Please insert coin first.");
	}

}
