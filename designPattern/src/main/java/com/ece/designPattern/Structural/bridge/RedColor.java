package com.ece.designPattern.Structural.bridge;

public class RedColor implements IShape {

	@Override
	public void fillColor() {

		System.out.println("Filling shape with Red color.");
	}

}
