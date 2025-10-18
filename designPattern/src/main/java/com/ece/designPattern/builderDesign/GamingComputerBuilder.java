package com.ece.designPattern.builderDesign;

public class GamingComputerBuilder implements Buider {

	Computer computer = null;

	public GamingComputerBuilder() {
		this.computer = new Computer();
	}

	@Override
	public void buildCpu() {
		computer.setCpu(16); // Setting CPU for Gaming Computer

	}

	@Override
	public void buildRam() {
		computer.setRam(32);
		// TODO Auto-generated method stub

	}

	@Override
	public void buildStorage() {
		computer.setStorage(1000); // Setting Storage for Gaming Computer
		// TODO Auto-generated method stub

	}
	
	public Computer getResults() {
		return computer;
	}

}
