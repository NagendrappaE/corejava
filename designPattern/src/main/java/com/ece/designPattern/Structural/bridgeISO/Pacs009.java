package com.ece.designPattern.Structural.bridgeISO;

public class Pacs009 extends AbstractISOMessageBridge {

	ValidationEngine eng;

	Pacs009(ValidationEngine validationEngine) {
		super(validationEngine);
		this.eng = validationEngine;

	}

	@Override
	void applyValidation(Object obj) {

		eng.runValidation(obj);
	}

}
