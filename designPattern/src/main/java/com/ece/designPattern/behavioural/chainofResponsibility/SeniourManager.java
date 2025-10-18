package com.ece.designPattern.behavioural.chainofResponsibility;

public class SeniourManager extends RequestHandler {

	public SeniourManager() {

		super("Seniour Manager");

	}

	@Override
	void setNextHandler(RequestHandler nextHandler) {

		this.nextHandler = nextHandler;

	}

	public void approve(int id) {

		if (id > 11 && id < 20) {

			System.out.println("Request " + id + " approved by " + name);
		} else {
			System.out.println("Request " + id + " cannot be approved by " + name + ", passing to next handler.");
			super.approve(id);

		}
	}

}
