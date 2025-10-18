package com.ece.designPattern.behaviouralDs.StateDesign2;

public class ReceivedState implements PackageState {

	@Override
	public void next(PackageP pkg) {

		System.out.println("Inside the Received State, Cannot go to next state");
	}

	@Override
	public void prev(PackageP pkg) {
		pkg.setState(new DeliverState());

	}

	@Override
	public void printStatus() {

		System.out.println("Package is received");
	}

}
