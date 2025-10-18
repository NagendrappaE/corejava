package com.ece.designPattern.Structural.decorator2;

public class AbstractCarDecorator implements CarDecorator {

	protected CarDecorator carDecorator;

	public AbstractCarDecorator(CarDecorator carDecorator) {
		this.carDecorator = carDecorator;
	}

	@Override
	public void assemble() {
		if (carDecorator != null) {
			carDecorator.assemble();
		}
	}

}
