package com.ece.designPattern.Structural.compositeISO;

//leaf
public class XSDxmlMessageValidation implements IISOXMLMessage {

	@Override
	public void executeXML(Object obj) {

		// Validating XSD

		System.out.println("Validating XSD for the provided object: " + obj);

	}

}
