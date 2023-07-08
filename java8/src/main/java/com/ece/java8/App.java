package com.ece.java8;

import com.ece.java8.functionalInter.CustomFunInterface;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		CustomFunInterface<Integer,Integer> sumFun = (a, b) -> a + b;

		Integer apply = sumFun.add(2, 3);

		System.out.println("the sum" + apply);

	}
}
