package com.ece.designPattern.Structural.compositeISO;
//leaf
public class PACS008C2 implements IISOXMLMessage {

	@Override
	public void executeXML(Object obj) {
		// Processing PACS008C2 message
		System.out.println("Processing PACS008C2 message for the provided object: " + obj);
	}

}
