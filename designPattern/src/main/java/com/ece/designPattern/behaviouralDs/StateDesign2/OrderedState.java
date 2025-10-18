package com.ece.designPattern.behaviouralDs.StateDesign2;

public class OrderedState implements PackageState {

	@Override
	public void next(PackageP pkg) {

		pkg.setState(new DeliverState());

	}

	@Override
	public void prev(PackageP pkg) {

		System.out.println("Inside  the Ordered State, Cannot go to previous state");

	}

	@Override
	public void printStatus() {

		System.out.println("Package is Ordered");

	}

}
