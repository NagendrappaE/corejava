package com.ece.designPattern.factoryds;

public class FactoryMain {
public static void main(String[] args) {
	
	ShapeFactory shapeFactory = new ConcreteShapeFactory();
	
	Shape circle=shapeFactory.createShape("CIRCLE");
	Shape square=shapeFactory.createShape("SQUARE");

}
}
