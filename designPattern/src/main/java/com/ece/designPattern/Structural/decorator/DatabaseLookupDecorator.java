package com.ece.designPattern.Structural.decorator;

import com.ece.designPattern.structuralDs.adapter3ISO.Pacs008Message;

public class DatabaseLookupDecorator extends AsbtractPacs008Decorator {

	private final BankCodeService bankCodeService;

	public DatabaseLookupDecorator(ISO20022Processor delegate, BankCodeService bankCodeService) {
		super(delegate);
		this.bankCodeService = bankCodeService;
	}

	@Override
	public void process(Pacs008Message message) {
		if (!bankCodeService.exists(message.getAmount()) || !bankCodeService.exists(message.getCdtrName())) {
			throw new IllegalArgumentException("Invalid BIC");
		}
		System.out.println("🏦 BIC lookup passed");
		super.process(message);
	}

}
