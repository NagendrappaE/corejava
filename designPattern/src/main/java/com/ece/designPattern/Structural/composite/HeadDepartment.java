package com.ece.designPattern.Structural.composite;

import java.util.ArrayList;
import java.util.List;

//Composite Element
public class HeadDepartment implements Department {
	private String id;
	private String name;

	private List<Department> childDepartments;

	public HeadDepartment(String id, String name) {

		this.id = id;
		this.name = name;
		this.childDepartments = new ArrayList<>();
	}

	@Override
	public void printDepartmentName() {

		childDepartments.stream().forEach(x -> x.printDepartmentName());

	}

	public void addDepartment(Department department) {
		childDepartments.add(department);
	}

	public void removeDepartment(Department department) {
		childDepartments.remove(department);
	}

}
