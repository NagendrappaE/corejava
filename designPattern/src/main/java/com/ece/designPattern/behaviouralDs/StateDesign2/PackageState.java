package com.ece.designPattern.behaviouralDs.StateDesign2;

public interface PackageState {

	void next(PackageP pkg);

	void prev(PackageP pkg);

	public void printStatus();
}
