package com.ece.designPattern.structuralDs.adapter3ISO;

public class Pacs008Message {
	private String dbtrName;
	private String cdtrName;
	private String amount;
	private String currency;
	private String dbtrAgent;
	private String cdtrAgent;

	public String getDbtrName() {
		return dbtrName;
	}

	public void setDbtrName(String dbtrName) {
		this.dbtrName = dbtrName;
	}

	public String getCdtrName() {
		return cdtrName;
	}

	public void setCdtrName(String cdtrName) {
		this.cdtrName = cdtrName;
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

	public String getDbtrAgent() {
		return dbtrAgent;
	}

	public void setDbtrAgent(String dbtrAgent) {
		this.dbtrAgent = dbtrAgent;
	}

	public String getCdtrAgent() {
		return cdtrAgent;
	}

	public void setCdtrAgent(String cdtrAgent) {
		this.cdtrAgent = cdtrAgent;
	}
}
