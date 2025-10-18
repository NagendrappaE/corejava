package com.ece.designPattern.Structural.bridgeISO;
//type of Bridge Design Pattern
public class Pacs008 extends AbstractISOMessageBridge {

	public ValidationEngine validationEngine;

	Pacs008(ValidationEngine validationEngine) {
		super(validationEngine);
		this.validationEngine = validationEngine;

	}

	@Override
	void applyValidation(Object obj) {
		validationEngine.runValidation(obj);
	}

}
