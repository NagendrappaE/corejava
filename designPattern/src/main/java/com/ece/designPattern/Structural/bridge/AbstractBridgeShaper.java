package com.ece.designPattern.Structural.bridge;

public class AbstractBridgeShaper {

	public IShape shape;

	public AbstractBridgeShaper(IShape shape) {

		this.shape = shape;
	}

	public void draw() {

		shape.fillColor();
	}

}
