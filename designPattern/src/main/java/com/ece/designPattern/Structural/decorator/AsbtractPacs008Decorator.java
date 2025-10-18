package com.ece.designPattern.Structural.decorator;

import com.ece.designPattern.structuralDs.adapter3ISO.Pacs008Message;

//Abstract Decorator
public abstract class AsbtractPacs008Decorator implements ISO20022Processor {

	protected ISO20022Processor decoratedProcessor;

	public AsbtractPacs008Decorator(ISO20022Processor decoratedProcessor) {
		this.decoratedProcessor = decoratedProcessor;
	}

	@Override
	public void process(Pacs008Message message) {
		// Delegate to the decorated processor
		decoratedProcessor.process(message);
	}

	// Additional methods can be added here for extended functionality

}
