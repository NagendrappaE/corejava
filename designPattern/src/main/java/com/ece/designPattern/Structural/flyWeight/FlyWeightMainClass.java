package com.ece.designPattern.Structural.flyWeight;

//client code 
public class FlyWeightMainClass {
	public static void main(String[] args) {

		Currency usd1 = CurrencyFactory.getCurrency("USD"); // it creates one instance
		Currency usd2 = CurrencyFactory.getCurrency("USD");// there is no instance created, it reuses the previous
															// instance
		Currency eur = CurrencyFactory.getCurrency("EUR");

		System.out.println(usd1); // Currency{code='USD'}
		System.out.println(usd2); // Currency{code='USD'}
		System.out.println(eur); // Currency{code='EUR'}

		System.out.println(usd1 == usd2); // true — reused
		System.out.println("Cache size: " + CurrencyFactory.getCacheSize()); // 2

	}
}
