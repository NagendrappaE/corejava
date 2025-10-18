package com.ece.designPattern.builderDesign;

public class ComputerDirector {

	public void buildComputer(Buider buider) {
		buider.buildCpu();
		buider.buildRam();
		buider.buildStorage();

	}

}
