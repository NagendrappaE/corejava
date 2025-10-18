package com.ece.designPattern.behavioural.chainofResponsibility2;

public class ErrorLogger extends AbstractLogger {


	public ErrorLogger() {
		super("ERROR");
	}

	@Override
	void setNextLogger(AbstractLogger nextLogger) {
		this.nextLogger = nextLogger;

	}

	void logMessage(int logLevel, Object message) {

		if (logLevel == 3) {
			System.out.println("Error Logger is processing the message: " + message);
		} else {
			System.out.println("Error Logger not available, passing to next logger.");
			super.logMessage(logLevel, message);

		}

	}

}
