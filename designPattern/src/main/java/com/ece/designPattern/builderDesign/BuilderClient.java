package com.ece.designPattern.builderDesign;

public class BuilderClient {

	public static void main(String[] args) {
		
		GamingComputerBuilder gamingComputerBuilder = new GamingComputerBuilder();
		
		ComputerDirector computerDirector = new ComputerDirector();
		
		
		computerDirector.buildComputer(gamingComputerBuilder);
		
		Computer computer = gamingComputerBuilder.getResults();
		
		
		computer.displayInfo();
		
	}
}
