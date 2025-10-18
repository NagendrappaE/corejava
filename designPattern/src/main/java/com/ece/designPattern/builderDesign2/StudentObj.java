package com.ece.designPattern.builderDesign2;

public class StudentObj implements BuilderI<StudentObj> {

	private String name;

	private String email;

	private String address;

	private String phoneNumber;

	// Buider its like optional field constructor
	public StudentObj setName(String name) {
		this.name = name;
		return this;
	}

	public StudentObj setEmail(String email) {
		this.email = email;

		return this;
	}

	public StudentObj setAddress(String address) {
		this.address = address;
		return this;
	}

	public StudentObj setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		return this;
	}

	@Override
	public StudentObj build() {

		return this;
	}

}
