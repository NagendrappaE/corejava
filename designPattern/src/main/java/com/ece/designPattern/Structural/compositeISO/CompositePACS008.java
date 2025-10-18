package com.ece.designPattern.Structural.compositeISO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Composite Class
public class CompositePACS008 implements IISOXMLMessage {

	private List<IISOXMLMessage> iisoXMLValidation = new ArrayList<>();

	public CompositePACS008(IISOXMLMessage... val) {

		Collections.addAll(iisoXMLValidation, val);

	}

	@Override
	public void executeXML(Object obj) {

		for (IISOXMLMessage iisoXMLMessage : iisoXMLValidation) {
			iisoXMLMessage.executeXML(obj);
		}

	}

}
