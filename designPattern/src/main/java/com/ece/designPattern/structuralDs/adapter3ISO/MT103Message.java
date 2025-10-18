package com.ece.designPattern.structuralDs.adapter3ISO;

public class MT103Message {

	private String senderBIC;
	private String receiverBIC;
	private String amount;
	private String currency;
	private String remitter;
	private String beneficiary;
	
	
	public MT103Message() {
	}

	public MT103Message(String senderBIC, String receiverBIC, String amount, String currency, String remitter,
			String beneficiary) {
		super();
		this.senderBIC = senderBIC;
		this.receiverBIC = receiverBIC;
		this.amount = amount;
		this.currency = currency;
		this.remitter = remitter;
		this.beneficiary = beneficiary;
	}

	public String getSenderBIC() {
		return senderBIC;
	}

	public void setSenderBIC(String senderBIC) {
		this.senderBIC = senderBIC;
	}

	public String getReceiverBIC() {
		return receiverBIC;
	}

	public void setReceiverBIC(String receiverBIC) {
		this.receiverBIC = receiverBIC;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getRemitter() {
		return remitter;
	}

	public void setRemitter(String remitter) {
		this.remitter = remitter;
	}

	public String getBeneficiary() {
		return beneficiary;
	}

	public void setBeneficiary(String beneficiary) {
		this.beneficiary = beneficiary;
	}
}
