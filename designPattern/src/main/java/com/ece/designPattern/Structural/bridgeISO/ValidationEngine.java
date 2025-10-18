package com.ece.designPattern.Structural.bridgeISO;
/*
 * The Bridge Design Pattern is an ideal fit for ISO 20022 validation because it allows you to:

    Separate the high-level concept of message type validation (e.g., pacs.008, pacs.009)

    From its implementation (e.g., JSON rule engine, SpEL validator, DB lookup, etc.)

This gives you flexibility to mix and match different validation strategies with different message types.
 */

public interface ValidationEngine {
	
	void runValidation(Object  obj);

}
