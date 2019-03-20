 package com.capgemini.inheritance.model;

class Manager extends Employee {

	private double petrolAllowance;
	private double foodAllowance;
	private double otherAllowance;
	
	private Manager() {
		super();
		
	}
	private Manager(long employeeId, String employeeName, double basicSalary, double medical,double kilometers) {
		super(employeeId, employeeName, basicSalary, medical);
		
	}
	private Manager(double petrolAllowance, double foodAllowance, double otherAllowance) {
		super();
		this.petrolAllowance = petrolAllowance;
		this.foodAllowance = foodAllowance;
		this.otherAllowance = otherAllowance;
	}
	@Override
	public double calculateGrossSalary(){
	petrolAllowance=0.08*getBasicSalary();
	foodAllowance=0.13*getBasicSalary();
	otherAllowance=0.03*getBasicSalary();
	return (super.calculateGrossSalary()+petrolAllowance+foodAllowance+otherAllowance);
	}
	
	public double netSalary() {
	
	return super.netSalary();
	}
}
