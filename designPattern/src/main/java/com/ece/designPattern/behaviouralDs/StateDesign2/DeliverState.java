package com.ece.designPattern.behaviouralDs.StateDesign2;

public class DeliverState implements PackageState {

	@Override
	public void next(PackageP pkg) {

		pkg.setState(new ReceivedState());

	}

	@Override
	public void prev(PackageP pkg) {
		pkg.setState(new OrderedState());

	}

	@Override
	public void printStatus() {

		System.out.println("Package is delivered");

	}

}
