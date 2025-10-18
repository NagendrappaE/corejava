package com.ece.designPattern.structuralDs.adapter2;

public class Iphone6s implements Iphone {

	@Override
	public void charge() {

		Iphone4sToIphone6s ip4s6s = new Iphone4sToIphone6s();
		ip4s6s.chargeOn();
	}

}
