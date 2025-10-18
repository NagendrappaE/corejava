package com.ece.designPattern.Structural.composite;

//Leaf2 
public class SalesDepartment implements Department {

	private String departmentid;
	
	private String departmentName;
	
	
	public SalesDepartment(String departmentid,String departmentName) {
		
		this.departmentid=departmentid;
		this.departmentName=departmentName;
		
	}
	
	@Override
	public void printDepartmentName() {

		System.out.println("The department details "+this.departmentid+"Department name"+this.departmentName);
		
	}

}
