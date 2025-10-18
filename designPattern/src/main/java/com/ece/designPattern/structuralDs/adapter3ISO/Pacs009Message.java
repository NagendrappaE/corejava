package com.ece.designPattern.structuralDs.adapter3ISO;

public class Pacs009Message {
	private String dbtrName;
	private String cdtrName;
	private String amount;
	private String currency;
	private String dbtrAgent;
	private String transactionAmount;
	
	private String orderingInstitution;
	
	
	private String debtorBIC;
	
	
	private String creditorBIC;
	
	public String getCreditorBIC() {
		return creditorBIC;
	}

	public void setCreditorBIC(String creditorBIC) {
		this.creditorBIC = creditorBIC;
	}

	public String getDebtorBIC() {
		return debtorBIC;
	}

	public void setDebtorBIC(String debtorBIC) {
		this.debtorBIC = debtorBIC;
	}

	public String getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(String transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public String getOrderingInstitution() {
		return orderingInstitution;
	}

	public void setOrderingInstitution(String orderingInstitution) {
		this.orderingInstitution = orderingInstitution;
	}

	public String getBeneficiaryInstitution() {
		return beneficiaryInstitution;
	}

	public void setBeneficiaryInstitution(String beneficiaryInstitution) {
		this.beneficiaryInstitution = beneficiaryInstitution;
	}

	private String beneficiaryInstitution;

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

	private String cdtrAgent;
}
