package com.ece.designPattern.Structural.bridge;

public class BridgeShapeMainClass {

	public static void main(String[] args) {

		IShape greenColor = new GreenColor();

		BridgeCircle circle = new BridgeCircle(greenColor);
		circle.draw();

		BridgeTriangle triangle=new BridgeTriangle(greenColor);
		triangle.draw();
		
	}
}
