package com.ece.designPattern.Structural.compositeISO;
//leaf
public class SPELXmlMessageValidation implements IISOXMLMessage {

	@Override
	public void executeXML(Object obj) {
//validating the SPEL  for the Provided aobject

		System.out.println("Validating SPEL for the provided object: " + obj);
	}

}
