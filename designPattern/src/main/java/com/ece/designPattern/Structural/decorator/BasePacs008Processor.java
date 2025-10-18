package com.ece.designPattern.Structural.decorator;

import com.ece.designPattern.structuralDs.adapter3ISO.Pacs008Message;
//2. Concrete Base Processor
public class BasePacs008Processor implements ISO20022Processor{

	@Override
	public void process(Pacs008Message message) {

		
		System.out.println("Processing Pacs008Message: " + message.getDbtrName() + " to " + message.getCdtrName());
	}

}
