package com.ece.designPattern.behavioural.chainofResponsibility;

public class Director extends RequestHandler {

	public Director( ) {
		super("Director");
		// TODO Auto-generated constructor stub
	}

	@Override
	void setNextHandler(RequestHandler nextHandler) {

		this.nextHandler = nextHandler;
    }
	
	public void approve(int id) {
		
		if (id > 20 && id < 30) {
			System.out.println("Request " + id + " approved by " + name);
		} else {
			System.out.println("Request " + id + " cannot be approved by " + name + ", passing to next handler.");
			super.approve(id);
		}
	}

}
