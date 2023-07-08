package com.ece.java8.MethodRef;

import java.util.function.Supplier;

public class Java8MainMeth {

	public static void main(String[] args) {

		// creating constructior
		Supplier<Java8Meth> ref = Java8Meth::new;
		System.out.println(ref.get());

		// setting some values will not work
		ref.get().setName("Nagendra");
		ref.get().setAge("20");

		// to access method using object ref using method reference
		Supplier<String> data = ref.get()::getName;

		System.out.println("the value " + data.get());

		// setting value
		Java8Meth obj = ref.get();
		obj.setName("Nagendra");
		obj.setAge("20");

		Supplier<String> dataRe = obj::getName;

		System.out.println("the data from object ref " + dataRe.get());
		
		
		//static Method
		Supplier<String> staticVal=Java8Meth::getData;
		
		System.out.println("the static vale"+staticVal.get());
		
		

	}

}
