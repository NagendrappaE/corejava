package com.ece.designPattern.Structural.decorator;

import com.ece.designPattern.structuralDs.adapter3ISO.Pacs008Message;
// Concrete Decorator for Encryption functionality
public class EncryptionDecorator extends AsbtractPacs008Decorator {

	public EncryptionDecorator(ISO20022Processor decoratedProcessor) {
		super(decoratedProcessor);
	}

	@Override
	public void process(Pacs008Message message) {
		System.out.println(
				"Encrypting message for debtor " + encrypt( message.getDbtrName()) + " to creditor " + message.getCdtrName());
		// Here you would add the actual encryption logic
		super.process(message);
		System.out.println(
				"Encryption completed for debtor " + message.getDbtrName() + " to creditor " + message.getCdtrName());
	}	

	private String encrypt(String value) {
		return value == null ? null : "ENC(" + value.substring(value.length() - 4) + ")";
	}

}
