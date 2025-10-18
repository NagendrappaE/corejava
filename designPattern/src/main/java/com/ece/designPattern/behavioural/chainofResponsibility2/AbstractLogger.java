package com.ece.designPattern.behavioural.chainofResponsibility2;

public abstract class AbstractLogger {

	private String loggerLevel;

	public AbstractLogger nextLogger;

	public AbstractLogger(String logName) {

		this.loggerLevel = logName;
	}

	abstract void setNextLogger(AbstractLogger nextLogger);

	void logMessage(int logLvele,Object message) {

		if (nextLogger != null) {
			nextLogger.logMessage(logLvele,message);

		} else {
			System.out.println("No further logger available to handle the message: " + message);
		}
	}

}
