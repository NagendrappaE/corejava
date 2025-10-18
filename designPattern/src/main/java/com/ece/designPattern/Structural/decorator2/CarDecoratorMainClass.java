package com.ece.designPattern.Structural.decorator2;

public class CarDecoratorMainClass {
	public static void main(String[] args) {

		CarDecorator car = new LuxuryCar(new SportsCar(new BasicCar()));

		car.assemble();
		
		//optiona 2
		System.out.println("---------------------------------------");
		
		CarDecorator	car2 = new SportsCar(new BasicCar());
		car2.assemble();
		
	}
	
}
