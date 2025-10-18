package com.ece.designPattern.Structural.flyWeight2;

import java.util.HashMap;
import java.util.Map;

public class FlyWeighCircleFactory {

	public static final Map<String, Cirlce> circleMap = new HashMap<>();

	public static Cirlce getCircle(String color) {

		circleMap.computeIfAbsent(color, Cirlce::new);
		return circleMap.get(color);

	}
	
	public static int getCacheSize() {
		return circleMap.size();
	}
}
