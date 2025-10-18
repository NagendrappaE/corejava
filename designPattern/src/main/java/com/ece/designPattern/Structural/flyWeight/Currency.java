package com.ece.designPattern.Structural.flyWeight;
//1. Flyweight Object
public class Currency {
	private final String code;

    Currency(String code) {
        this.code = code;
    }
    
	public String getCode() {
		return code;
	}

	

	@Override
	public String toString() {
		return "Currency{" + "code='" + code + '\'' + '}';
	}

}
