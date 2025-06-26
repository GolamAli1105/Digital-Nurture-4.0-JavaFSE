package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import main.Calculator;

class Exercise4 {
	
	private Calculator calc;
	
	@BeforeEach
	public void setUp() {
		calc = new Calculator();
		System.out.println("Setup before each test");
	}
	
	@Test
	public void testAddAAA() {
		int a = 5;
		int b = 7;
		int result = calc.add(a, b);
		assertEquals(12,result);
	}
	
	@Test
	public void testSubtractAAA() {
		int a = 13;
		int b = 8;
		int result = calc.subtract(a, b);
		assertEquals(5,result);
	}
	
	@AfterEach
	public void tearDown() {
		calc = null;
		System.out.println("Cleanup after each test");
	}

}
