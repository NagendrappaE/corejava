package com.ece.designPattern.structuralDs.adapter3ISO;

public class MT202ToPacs009Adapter implements MessageAdapter<Pacs009Message> {

	private final MT202Message mt202;

	public MT202ToPacs009Adapter(MT202Message mt202) {
		this.mt202 = mt202;
	}

	@Override
	public Pacs009Message transform() {
		Pacs009Message mx = new Pacs009Message();
		mx.setTransactionAmount(mt202.getAmount());
		mx.setDebtorBIC(mt202.getOrderingInstitution());
		mx.setCreditorBIC(mt202.getBeneficiaryInstitution());
		return mx;
	}

}
