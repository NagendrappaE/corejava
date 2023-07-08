/**
 * 
 */
package com.ece.java8.functionalInter;

/**
 * @author nagendrappae
 *
 */
public interface CustomFunInterfaceTwo<T, R> {

	public R multipleNum(T a);

	// we can add n number of default methods

	default <V> CustomFunInterfaceTwo<T, V> andThen(CustomFunInterfaceTwo<? super R, ? extends V> after) {

		return (T a) -> after.multipleNum(multipleNum(a));

	}

}
