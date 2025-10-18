package com.ece.designPattern.Structural.decorator2;

public class LuxuryCar extends AbstractCarDecorator {

	public LuxuryCar(CarDecorator carDecorator) {
		super(carDecorator);
	}

	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Luxury Car Decorator");
		addLuxuryFeatures();
	}

	private void addLuxuryFeatures() {
		System.out.println("Adding luxury features to the car.");
	}

}
