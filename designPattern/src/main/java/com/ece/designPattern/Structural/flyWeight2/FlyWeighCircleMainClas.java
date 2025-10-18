package com.ece.designPattern.Structural.flyWeight2;

public class FlyWeighCircleMainClas {
	private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			Cirlce circle = FlyWeighCircleFactory.getCircle(getRandomColor());
			circle.setX(i);
			circle.setRadius(i);
			circle.draw();

		}

		int size = FlyWeighCircleFactory.getCacheSize();

		System.out.println("Total number of circles created: " + size);
	}

	private static String getRandomColor() {
		return colors[(int) (Math.random() * colors.length)];
	}
}
