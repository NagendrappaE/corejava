package com.ece.designPattern.Structural.bridgeISO;

public class BridgePatternTest {
	public static void main(String[] args) {

		ValidationEngine spelEngine = new SpELValidator();

		Pacs008 spelPacs008Validato = new Pacs008(spelEngine);

		spelPacs008Validato.applyValidation("new  object");

		Pacs008 xsdPacs008Validato = new Pacs008(new XSDValidator());

		xsdPacs008Validato.applyValidation("new  NNNN");

		Pacs008 jsonPacs008Validato = new Pacs008(new JsonRuleValidator());

		jsonPacs008Validato.applyValidation("nnnn");

	}
}
