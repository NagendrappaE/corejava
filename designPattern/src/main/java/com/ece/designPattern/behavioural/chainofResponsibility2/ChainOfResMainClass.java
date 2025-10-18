package com.ece.designPattern.behavioural.chainofResponsibility2;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ChainOfResMainClass {
	public static void main(String[] args) {

		String uuid ="3ce3e3d5-64f6-4e5d-b72e-0570bf6";
				//java.util.UUID.randomUUID().toString().substring(0,31);

		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
		String timestamp ="2025-06-13 17:35:52.247";
				
				//now.format(formatter);

		String password = "M@y(*&^%Okt&*&7!";

		System.out.println("Generated UUID: " + uuid + "\nTimestamp: " + timestamp + "\nPassword: " + password);

		String text = password + uuid + timestamp;
		String hash = generateSHA256(text);
		System.out.println("SHA-256 Hash of '" + text + "': " + hash);

		InfoLogger infoLogger = new InfoLogger();

		ConsoleLogger consoleLogger = new ConsoleLogger();

		ErrorLogger errorLogger = new ErrorLogger();

		consoleLogger.setNextLogger(infoLogger);
		infoLogger.setNextLogger(errorLogger);

		consoleLogger.logMessage(3, "HELLLOO CHAIN OF RESPONSIBILITY PATTERN");

	}

	public static String generateSHA256(String input) {
		try {
			// Create MessageDigest instance for SHA-256
			MessageDigest digest = MessageDigest.getInstance("SHA-256");

			// Apply SHA-256 to input
			byte[] hashBytes = digest.digest(input.getBytes(StandardCharsets.UTF_8));

			// Convert to hex string
			StringBuilder hexString = new StringBuilder();
			for (byte b : hashBytes) {
				hexString.append(String.format("%02x", b));
			}

			return hexString.toString();
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException("SHA-256 algorithm not available", e);
		}
	}

}
