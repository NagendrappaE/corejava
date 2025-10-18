package com.ece.designPattern.behaviouralDs.StateDesign3;

public class RedLightState implements TrafficLightState {

	@Override
	public void next(TrafficeLight trafficLight) {
		trafficLight.setTraficState(new YellowLightState());
	}

	@Override
	public void display() {
		System.out.println("Red Light is ON");
	}

}
