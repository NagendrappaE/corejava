package com.ece.designPattern.Structural.decorator;

import com.ece.designPattern.structuralDs.adapter3ISO.Pacs008Message;
/*Great choice! The Decorator Design Pattern is a powerful way to dynamically add behavior to ISO 20022 message processing without modifying core message classes like Pacs008Message, Camt054Message, etc.
 * 
 * We want to decorate a Pacs008Message with additional responsibilities (e.g., validation or logging) at runtime.
 */
// Decorator Design Pattern   BASE Interface
public interface ISO20022Processor {
    void process(Pacs008Message message);
}
