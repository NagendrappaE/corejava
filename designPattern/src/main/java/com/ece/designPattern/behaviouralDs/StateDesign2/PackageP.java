package com.ece.designPattern.behaviouralDs.StateDesign2;

public class PackageP {
	
	private PackageState state = new OrderedState();

	public PackageState getState() {
		return state;
	}

	public void setState(PackageState state) {
		this.state = state;
	}

	

	public void previousState() {
		state.prev(this);
	}

	public void nextState() {

		state.next(this);

	}

	public void printState() {
		state.printStatus();
	}
}
