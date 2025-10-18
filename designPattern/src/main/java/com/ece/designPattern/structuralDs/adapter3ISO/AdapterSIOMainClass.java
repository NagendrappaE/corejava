package com.ece.designPattern.structuralDs.adapter3ISO;

public class AdapterSIOMainClass {

	public static void main(String[] args) {
		AdapterRegistry registry = new AdapterRegistry();

		registry.register("MT202_TO_PACS009", input -> new MT202ToPacs009Adapter((MT202Message) input));
		registry.register("PACS008_TO_MT103", input -> new Pacs008ToMT103Adapter((Pacs008Message) input));

		MT103Message mt103 = new MT103Message("John", "Alice", "1000", "USD", "IFSC", "BIC");

		MessageAdapter<?> adapter = registry.getAdapter("MT103_TO_PACS008", mt103);
		Pacs008Message pacs = (Pacs008Message) adapter.transform();

		System.out.println("Converted to pacs.008: " + pacs.getDbtrName() + " → " + pacs.getCdtrName());

	}
}
