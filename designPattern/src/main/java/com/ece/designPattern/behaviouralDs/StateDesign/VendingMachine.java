package com.ece.designPattern.behaviouralDs.StateDesign;

public class VendingMachine {

	public VendingState machineState;

	public VendingState getMachineState() {
		return machineState;
	}

	public void setMachineState(VendingState machineState) {
		this.machineState = machineState;
	}

	
	
}
