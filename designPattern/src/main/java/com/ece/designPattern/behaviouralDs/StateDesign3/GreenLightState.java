package com.ece.designPattern.behaviouralDs.StateDesign3;

public class GreenLightState implements TrafficLightState {

	@Override
	public void next(TrafficeLight trafficLight) {
		trafficLight.setTraficState(new RedLightState());
	}

	@Override
	public void display() {
		System.out.println("Green Light is ON");
	}

}
