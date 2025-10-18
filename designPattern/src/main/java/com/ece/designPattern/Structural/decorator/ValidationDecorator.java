package com.ece.designPattern.Structural.decorator;

import com.ece.designPattern.structuralDs.adapter3ISO.Pacs008Message;

// Concrete Decorators  added ValidationDecorator
public class ValidationDecorator extends AsbtractPacs008Decorator {

	public ValidationDecorator(ISO20022Processor decoratedProcessor) {
		super(decoratedProcessor);

	}

	@Override
	public void process(Pacs008Message message) {
		if (message.getAmount() == null || message.getDbtrName() == null) {
			throw new IllegalArgumentException("Missing required fields");
		}
		System.out.println("Validation passed");
		super.process(message);
	}
}
