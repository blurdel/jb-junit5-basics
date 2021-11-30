package com.blurdel.utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathUtilsTest {
	
	private MathUtils mathUtils;
	

	@BeforeEach
	void initEach() {
		mathUtils = new MathUtils();
	}
	
	
	@Test
	void testAdd2Positives() {
//		fail("Not yet implemented");
		
		assertEquals(2, mathUtils.add(1, 1),
				"Add method should return the sum of two numbers");
	}
	
	@Test
	void testAdd2Negatives() {
		assertEquals(-2, mathUtils.add(-1, -1), 
				"Add method should return the sum of two numbers");
	}
	
	@Test
	void testAddingAPositiveAndANegative() {
		assertEquals(0, mathUtils.add(-1, 1), 
				"Add method should return the sum of two numbers");
	}
	
	
	@Test
	void testSubtract() {
		assertEquals(0, mathUtils.subtract(1, 1), 
				"Subtract method should return the difference of two numbers");
	}
	
	
	@Test 
	void testMultiply() {
		assertAll(
				() -> assertEquals(0, mathUtils.multiply(1, 0)),
				() -> assertEquals(1, mathUtils.multiply(1, 1)),
				() -> assertEquals(6, mathUtils.multiply(2, 3))
				);
	}
	
	
	@Test
	void testDivide() {
		assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0), 
				"Divide should throw ArithmeticException when denominator is 0");
		
		assertAll(
				() -> assertEquals(3, mathUtils.divide(6, 2)),
				() -> assertEquals(0, mathUtils.divide(0, 1)),
				() -> assertEquals(10, mathUtils.divide(10, 1))
				);
	}

	
	@Test
	void testComputeCirlceArea() {
		assertEquals(314.1592653589793, mathUtils.computeCircleArea(10), 
				"Should compute correct circle area");
	}

}
