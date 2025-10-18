package com.ece.designPattern.composition;

public class Car {

	private Engine engine; // cpmposition

	public Car() {
		this.engine = new Engine();
	}

	public void startCar() {

		this.engine.start();
	}

}
