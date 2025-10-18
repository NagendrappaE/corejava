package com.ece.designPattern.behavioural.chainofResponsibility;

public class Manager extends RequestHandler {

	public Manager() {

		super("Manager");
	}

	@Override
	void setNextHandler(RequestHandler nextHandler) {

		this.nextHandler = nextHandler;
	}
	
	@Override
	public void approve(int id) {
	
		
		if(id>0 && id<=10) {
			
		System.out.println("Request " + id + " approved by " + name);
        } else {
            System.out.println("Request " + id + " cannot be approved by " + name + ", passing to next handler.");
            super.approve(id);
        }
	}
}