package com.ece.designPattern.Structural.bridgeISO;

/*
 * it will bridge 2 abstractions:  once is PACS and CAMT messages with  Validations(SPEL,DB,XSD etc) */
public abstract class AbstractISOMessageBridge {

	public ValidationEngine validationEngine;

	AbstractISOMessageBridge(ValidationEngine validationEngine) {
		this.validationEngine = validationEngine;
	}

	abstract void applyValidation(Object obj);

}
