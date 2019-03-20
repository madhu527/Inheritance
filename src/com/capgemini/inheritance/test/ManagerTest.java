package com.capgemini.inheritance.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.inheritance.model.Employee;

public class ManagerTest {
	Employee manager;
	@BeforeEach
	public void setUp() {
		manager = new Employee(101,"madhu",20000,5000);
		assertNotNull(manager);
	}
	@Test
	public void calculateManagerGrossSalary() {
	assertEquals(35000,manager.calculateGrossSalary(),0.01);
	}
	@Test
	public void calculateManagerNetSalary() {
	assertEquals(32400,manager.netSalary(),0.01);
}	
}
	
	






 