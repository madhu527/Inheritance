package com.capgemini.inheritance.model;

public class MarketingExecutive extends Employee {
	private double kiloMeters;
	private double tourAllowance = 5;
	private double telephoneAllowance=1500;
	
	
	public MarketingExecutive() {
		super();
		
	}
	public MarketingExecutive(long employeeId, String employeeName, double basicSalary, double medical, double kiloMeters) {
		super(employeeId, employeeName, basicSalary, medical);
		this.kiloMeters = kiloMeters;
	}
	


	public double getcalculateGrossSalary() {
      
      return calculateGrossSalary()+ kiloMeters*tourAllowance + telephoneAllowance;
      
      
      
      }
}   

	 