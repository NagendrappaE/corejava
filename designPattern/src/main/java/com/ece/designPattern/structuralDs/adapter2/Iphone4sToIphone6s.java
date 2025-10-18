package com.ece.designPattern.structuralDs.adapter2;

public class Iphone4sToIphone6s implements Charge {

	Iphone4s iphone4s = null;

	public Iphone4sToIphone6s() {

		iphone4s = new Iphone4s();
	}

	@Override
	public void chargeOn() {
		iphone4s.chargeOn();
	}

}
