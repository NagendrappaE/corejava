package com.ece.designPattern.structuralDs.adapter3ISO;

public class Pacs008ToMT103Adapter implements MessageAdapter<MT103Message> {
	private final Pacs008Message pacs;

	public Pacs008ToMT103Adapter(Pacs008Message pacs) {
		this.pacs = pacs;
	}

	@Override
	public MT103Message transform() {
		MT103Message mt103 = new MT103Message();
		mt103.setRemitter(pacs.getDbtrName());
		mt103.setBeneficiary(pacs.getCdtrName());
		mt103.setCurrency(pacs.getCurrency());
		mt103.setAmount(pacs.getAmount());
		mt103.setSenderBIC(pacs.getDbtrAgent());
		mt103.setReceiverBIC(pacs.getCdtrAgent());
		return mt103;
	}
}
