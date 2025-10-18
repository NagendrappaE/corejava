package com.ece.designPattern.Structural.compositeISO;

import com.ece.designPattern.Structural.bridgeISO.Pacs008;
import com.ece.designPattern.Structural.bridgeISO.Pacs009;

public class CompositePACSClient {
	public static void main(String[] args) {

		Pacs008 pacs808 = null;

		IISOXMLMessage cbprplusXML = new CBPRPlusXMlValidation();
		IISOXMLMessage pacs008c1 = new PACS008C1();

		IISOXMLMessage pacs009c1 = new PACS009C1();

		CompositePACS008 pacs008comp = new CompositePACS008(cbprplusXML, pacs008c1);

		pacs008comp.executeXML(pacs808);
		
		
		CompositePACS009 pacs009comp = new CompositePACS009(cbprplusXML, pacs009c1);
		
		Pacs009 pacs009 = null;
		
		pacs009comp.executeXML(pacs009);

	}
}
