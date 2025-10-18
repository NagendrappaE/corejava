package com.ece.designPattern.Structural.decorator;

import com.ece.designPattern.structuralDs.adapter3ISO.Pacs008Message;
//// Concrete Decorator for Logging functionality
public class LoggingDecorator extends AsbtractPacs008Decorator {

	public LoggingDecorator(ISO20022Processor decoratedProcessor) {
		super(decoratedProcessor);
	}

	@Override
	public void process(Pacs008Message message) {
		System.out.println("Logging: Processing message for debtor " + message.getDbtrName() + " to creditor "
				+ message.getCdtrName());
		super.process(message);
		System.out.println("Logging: Finished processing message for debtor " + message.getDbtrName() + " to creditor "
				+ message.getCdtrName());
	}

}
