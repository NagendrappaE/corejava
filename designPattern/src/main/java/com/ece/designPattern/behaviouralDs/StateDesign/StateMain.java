package com.ece.designPattern.behaviouralDs.StateDesign;

public class StateMain {
public static void main(String[] args) {
	
	
	VendingMachine vendingMachine=new VendingMachine();
	
	
	IdleState idleState = new IdleState();
	
	idleState.insertCoin(vendingMachine);

	
	vendingMachine.setMachineState(idleState);
	//vendingMachine.getMachineState();
	
	WorkingState workingState = new WorkingState();
	
	workingState.dispenseItem(vendingMachine);
	
	System.out.println("Current State: " + vendingMachine.getMachineState());
	

}
}
