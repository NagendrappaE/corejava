package com.ece.designPattern.behavioural.chainofResponsibility;

public class ChainOfResponsibMainClass {
	public static void main(String[] args) {

		RequestHandler manager = new Manager();
		RequestHandler seniorManager = new SeniourManager();
        RequestHandler director = new Director();
        
		
		manager.setNextHandler(seniorManager);
		seniorManager.setNextHandler(director);
		
		manager.approve(121);
		
		
		
		
		
	}
}
