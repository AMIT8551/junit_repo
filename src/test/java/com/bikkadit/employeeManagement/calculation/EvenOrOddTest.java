package com.bikkadit.employeeManagement.calculation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EvenOrOddTest {

	@Test
	public void evenorodd_EvenTest() {
		
		EvenOrOdd EvenOrOdd = new EvenOrOdd();
		
		boolean actualResult = EvenOrOdd.evenorodd(50);
		assertTrue(actualResult);
	}
	
	@Test
	public void evenorodd_OddTest() {
		
		EvenOrOdd EvenOrOdd = new EvenOrOdd();
		
		boolean actualResult = EvenOrOdd.evenorodd(13);
		assertFalse(actualResult);
	}

}
