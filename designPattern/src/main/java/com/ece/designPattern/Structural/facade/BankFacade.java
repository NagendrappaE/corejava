package com.ece.designPattern.Structural.facade;

public class BankFacade {

	private AccountService accountService;
	private TransferService transferService;
	private BillPaymentService billPaymentService;

	public BankFacade() {
		this.accountService = new AccountService();
		this.transferService = new TransferService();
		this.billPaymentService = new BillPaymentService();
	}

	public void getAccountDetails(String accountNumber) {

		this.accountService.getAccountDetails(accountNumber);
	}

	public void transferFundDetails(String accountFrom, String accountTo, double amount) {

		this.transferService.transferFunds(accountFrom, accountTo, amount);
	}
	
	public void payBill(String accountNumber, String billType, double amount) {

		this.billPaymentService.payBill(accountNumber, billType, amount);
	}

}
