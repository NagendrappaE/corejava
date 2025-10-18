package com.ece.designPattern.Structural.flyWeight2;

public class Cirlce implements Shape {

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	private String color;
	private int radius;
	private int x;
	private int y;

	public Cirlce(String color) {
		this.color = color;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Circle of color: " + color + " and radius: " + radius);
	}

}
