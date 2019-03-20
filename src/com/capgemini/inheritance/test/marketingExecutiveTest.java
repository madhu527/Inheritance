package com.capgemini.inheritance.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.Test;

import com.capgemini.inheritance.model.MarketingExecutive;

public class marketingExecutiveTest {

	MarketingExecutive marketer;
	@Before
	public void setUp() {
	marketer=new MarketingExecutive(101,"madhu",20000,5000,150);
	assertNotNull(marketer);
	
	}
	@Test
	public void  calculateGrossSalary() {
		marketer=new MarketingExecutive(101,"madhu",20000,5000,150);
	assertEquals(37250,marketer.getcalculateGrossSalary(),0.01);
	}
}
