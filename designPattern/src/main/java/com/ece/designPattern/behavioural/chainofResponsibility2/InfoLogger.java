package com.ece.designPattern.behavioural.chainofResponsibility2;

public class InfoLogger extends AbstractLogger {


	public InfoLogger() {
		super("INFO");
		// TODO Auto-generated constructor stub
	}

	@Override
	void setNextLogger(AbstractLogger nextLogger) {

		this.nextLogger = nextLogger;
	}
	
	public void logMessage(int logLevel,Object message) {
		
		if(logLevel==1) {

			System.out.println(" is processing the message: " + message);
		}else {
			System.out.println("Info Logger not available, passing to next logger");
			super.logMessage(logLevel, message);
		}
		
		
	}

}
