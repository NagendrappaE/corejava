package com.ece.designPattern.behaviouralDs.StateDesign3;

public class TrafficeLight {

	private TrafficLightState traficState = new RedLightState();

	public void setTraficState(TrafficLightState traficState) {
		this.traficState = traficState;
	}

	public void change() {

		traficState.next(this);

	}

	public void disaplyLight() {

		traficState.display();
	}

}
