package com.ece.designPattern.builderDesign2;

import java.util.Collection;
import java.util.Collections;

public class BuilderClientA {
	public static void main(String[] args) {

		Post postObject = new Post.Builder().text("NAAA").build();

		System.out.println(postObject);
		
		StudentObj obj=new StudentObj().setName("dd").setEmail("Nag@gmail.com").build();
		
		System.out.println(obj.toString());
		
		Collections.singletonList(obj);

}

}