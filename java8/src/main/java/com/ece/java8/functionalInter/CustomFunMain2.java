/**
 * 
 */
package com.ece.java8.functionalInter;

/**
 * @author nagendrappae
 *
 */
public class CustomFunMain2 {

	public static void main(String[] args) {
		CustomFunInterface<Integer, Integer> sumFun = (a, b) -> a + b;

		CustomFunInterfaceTwo<Integer, Integer> mult = (x) -> x * 10;

		System.out.println("the mult" + mult.multipleNum(10));
		// Integer finalS=sum2.andThen(sumFun);

	}

}
