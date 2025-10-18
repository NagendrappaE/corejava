package com.ece.designPattern.behavioural.chainofResponsibility2;

public class ConsoleLogger extends AbstractLogger {


	public ConsoleLogger() {
		super("CONSOLE");
	}

	@Override
	void setNextLogger(AbstractLogger nextLogger) {
		this.nextLogger = nextLogger;
	}
	
	public void logMessage(int logLevel, Object message) {

		if (logLevel == 2) {
			System.out.println("Console Logger is processing the message: " + message);
		} else {
			System.out.println("Console Logger not available, passing to next logger.");
			super.logMessage(logLevel, message);
		}

	}

}
