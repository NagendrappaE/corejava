package com.ece.designPattern.protoTypeds;

public class Circle implements Shape {
	
	public Circle() {
		System.out.println("Circle is created");
	}

	public Circle clone() {
		
		Circle circle=null;
		try {
			circle=(Circle)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return circle;
	}
	
	public void draw() {
		System.out.println("Circle is drawn");
	}
}
