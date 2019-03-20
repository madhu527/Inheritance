package com.capgemini.inheritance.test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.inheritance.model.Employee;

 

public class EmployeeTest {
	
	 Employee employee;
	
	@Before
	public void setUp() {
		// TODO Auto-generated method stub
        employee=new Employee(101,"madhu",20000,5000);
	}
	@Test
	public void  tesEmployeetObjectCreatedwithDefaultConstructor() {
		 Employee employee=new Employee();
		assertNotNull(employee);
		}
	
	
	@Test
	public void employeeDetails() {
		 employee= new  Employee(101,"madhu",20000,5000);
		assertEquals(101,employee.getEmployeeId());
		assertEquals("madhu",employee.getEmployeeName());
		assertEquals(20000.0,employee.getBasicSalary(),0.01);
		assertEquals(5000.0,employee.getMedical(),0.01);
	}
	
	@Test
	public void testCheckEmployeeSalary() {
		
		assertEquals(35000,employee.calculateGrossSalary(),0.05);
	}
	
}