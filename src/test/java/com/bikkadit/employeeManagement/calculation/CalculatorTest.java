package com.bikkadit.employeeManagement.calculation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class CalculatorTest {

	@Test
	public void sumTest() {
		Calculator Calculator =new Calculator();
		
		int actualResult = Calculator.sum(10,20);
		int expectedResult = 30;
		assertEquals(expectedResult,actualResult );
	}
	
	@Test
	public void subTest() {
		Calculator Calculator =new Calculator();
		
		int actualResult = Calculator.sub(40,20);
		int expectedResult = 20;
		assertEquals(expectedResult,actualResult );
	}
	
	@Test
	public void mulTest() {
		Calculator Calculator =new Calculator();
		
		int actualResult = Calculator.mul(10,20);
		int expectedResult = 200;
		assertEquals(expectedResult,actualResult );
	}
	
	@Test
	public void divTest() {
		Calculator Calculator =new Calculator();
		
		int actualResult = Calculator.div(10,5);
		int expectedResult = 2;
		assertEquals(expectedResult,actualResult );
	}

}
