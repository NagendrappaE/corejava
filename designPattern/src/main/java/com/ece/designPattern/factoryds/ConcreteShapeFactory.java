package com.ece.designPattern.factoryds;

public class ConcreteShapeFactory implements ShapeFactory {

	@Override
	public Shape createShape(String shapeType) {

		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}

}
