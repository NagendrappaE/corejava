package com.ece.designPattern.Structural.decorator;

import com.ece.designPattern.structuralDs.adapter3ISO.Pacs008Message;

public class DecoratorISO20022MainClass {

	public static void main(String[] args) {
		Pacs008Message msg = new Pacs008Message();

		BankCodeService bankService = new BankCodeService();

		ISO20022Processor processor = new EncryptionDecorator(
				new SpELValidationDecorator(new DatabaseLookupDecorator(new BasePacs008Processor(), bankService)));

		processor.process(msg);
	}
}
