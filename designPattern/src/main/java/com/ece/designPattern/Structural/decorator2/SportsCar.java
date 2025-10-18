package com.ece.designPattern.Structural.decorator2;

public class SportsCar extends AbstractCarDecorator {

	public SportsCar(CarDecorator carDecorator) {
		super(carDecorator);
	}

	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Adding features of Sports Car.");
		System.out.println("Sports Car is ready.");
	}

}
