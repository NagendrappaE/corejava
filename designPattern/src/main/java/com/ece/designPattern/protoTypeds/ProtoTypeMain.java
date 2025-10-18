package com.ece.designPattern.protoTypeds;

public class ProtoTypeMain {

	public static void main(String[] args) {
		
		Circle circle = new Circle();
		
		Circle clonedCircle= circle.clone();
		
		System.out.println("Original Circle: " + circle);
		
		System.out.println("Cloned Circle: " + clonedCircle);
		
	}
}
