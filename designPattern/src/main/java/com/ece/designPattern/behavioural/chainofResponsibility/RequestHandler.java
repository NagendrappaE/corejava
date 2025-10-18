package com.ece.designPattern.behavioural.chainofResponsibility;

public abstract class RequestHandler {

	String name;

	RequestHandler nextHandler;

	private RequestHandler() {
		// This constructor is intentionally left empty to prevent instantiation without
		// a name.
	
	}
	
	public RequestHandler(String name) {
		this.name = name;
	}

	abstract void setNextHandler(RequestHandler nextHandler);
	
	public void approve(int id) {
		
		if (nextHandler != null) {
			nextHandler.approve(id);
		} else {
			System.out.println("Request " + id + " cannot be approved by " + name + ", no further handlers.");
		}
	}

}
