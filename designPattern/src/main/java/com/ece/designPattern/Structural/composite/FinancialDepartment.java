package com.ece.designPattern.Structural.composite;

//Leaf Financial Department
public class FinancialDepartment implements Department {

	String departmentId;

	String departmentName;

	public FinancialDepartment(String departmentId, String departmentName) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}

	@Override
	public void printDepartmentName() {

		System.out.println(
				"The Financial Department Name " + this.departmentId + " Department Name  " + this.departmentName);

	}
	


}
