package com.capgemini.inheritance.model;

public class Employee {

	private long employeeId;
	private String employeeName;
	private double basicSalary;
	private double hra;
	private double medical;
	private double pf;
	public static final double pt=200;
	private double netSalary;
	private double grossSalary;
	
	public Employee() {
		
	}



	public Employee(long employeeId, String employeeName, double basicSalary, double medical) {
		this.employeeId=  employeeId;
		this.employeeName = employeeName;
		this.basicSalary= basicSalary;
		this.medical = medical;
	}
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getBasicSalary() {
		return basicSalary;
	}



	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}



	public double getHra() {
		return hra;
	}



	public void setHra(double hra) {
		this.hra = hra;
	}



	public double getMedical() {
		return medical;
	}



	public void setMedical(double medical) {
		this.medical = medical;
	}



	public double getPf() {
		return pf;
	}



	public void setPf(double pf) {
		this.pf = pf;
	}



	public double getNetSalary() {
		return netSalary;
	}



	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}



	public double getGrossSalary() {
		return grossSalary;
	}



	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}



	public static double getPt() {
		return pt;
	}



	public double calculateGrossSalary() {
		double hra = 0.50 * basicSalary;
		
		double grossSalary = basicSalary + hra + medical ;
		return grossSalary;
	}
	
	public double netSalary() {
		double pf = 0.12 * basicSalary;
		double netSalary = calculateGrossSalary() - (pf + pt);
		
		return netSalary;
		
	}

}