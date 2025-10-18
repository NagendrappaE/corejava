package com.ece.designPattern.behaviouralDs.StateDesign3;

public class YellowLightState implements TrafficLightState {

	@Override
	public void next(TrafficeLight trafficLight) {
		trafficLight.setTraficState(new GreenLightState());
	}

	@Override
	public void display() {
		System.out.println("Yellow Light is ON");
	}

}
