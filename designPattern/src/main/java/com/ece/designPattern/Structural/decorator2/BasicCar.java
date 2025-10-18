package com.ece.designPattern.Structural.decorator2;

public class BasicCar implements CarDecorator {

	@Override
	public void assemble() {
		System.out.println("Basic Car.");
	}

	// Additional methods specific to BasicCar can be added here
	// For example, you might want to add a method to get the car's model or
	// features 

}
