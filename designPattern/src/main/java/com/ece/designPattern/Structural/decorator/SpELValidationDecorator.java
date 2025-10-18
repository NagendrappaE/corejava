package com.ece.designPattern.Structural.decorator;

import com.ece.designPattern.structuralDs.adapter3ISO.Pacs008Message;

public class SpELValidationDecorator extends AsbtractPacs008Decorator {

	public SpELValidationDecorator(ISO20022Processor decoratedProcessor) {
		super(decoratedProcessor);
	}

	@Override
	public void process(Pacs008Message message) {
		/*
		 * StandardEvaluationContext ctx = new StandardEvaluationContext(message);
		 * SpelExpressionParser parser = new SpelExpressionParser(); Boolean result =
		 * parser.parseExpression("amount != null and currency == 'USD'").getValue(ctx,
		 * Boolean.class); if (!Boolean.TRUE.equals(result)) { throw new
		 * IllegalArgumentException("SpEL validation failed"); }
		 */
		System.out.println("SpEL validation passed");
		super.process(message);
	}

}
