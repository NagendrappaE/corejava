package com.ece.designPattern.Structural.composite;

public class CompositeMainClass {
	public static void main(String[] args) {

		HeadDepartment headDepart = new HeadDepartment("1", "HEADDEPART");

		headDepart.addDepartment(new FinancialDepartment("2", "Fiance Department"));
		headDepart.addDepartment(new SalesDepartment("3", "SALES"));
		
		headDepart.printDepartmentName();

	}
}
