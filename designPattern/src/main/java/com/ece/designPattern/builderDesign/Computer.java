package com.ece.designPattern.builderDesign;

/* https://www.geeksforgeeks.org/builder-design-pattern/
 * its a Product we need to build 
 */


public class Computer {

	private int cpu;
	
	private int ram;
	
	private int storage;

	public int getCpu() {
		return cpu;
	}

	public void setCpu(int cpu) {
		this.cpu = cpu;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}
	
	
	 public void displayInfo() {
	        System.out.println("Computer Configuration:");
	        System.out.println("CPU: " + cpu);
	        System.out.println("RAM: " + ram);
	        System.out.println("Storage: " + storage);
	    }
	
}
