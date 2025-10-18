package com.ece.designPattern.Structural.flyWeight;

import java.util.HashMap;
import java.util.Map;

//2. Flyweight Factory

/*
 * which are shared, immutable, and memory-heavy when duplicated
 */
/*
 * Flyweight pattern is primarily used to reduce the number of objects created and to decrease memory footprint and increase performance. This type of design pattern comes under structural pattern as this pattern provides ways to decrease object count thus improving the object structure of application.


 */
public class CurrencyFactory {

	private static final Map<String, Currency> cache = new HashMap<>();

	public static Currency getCurrency(String code) {
		return cache.computeIfAbsent(code, Currency::new);
	}

	public static int getCacheSize() {
		return cache.size();
	}
}
