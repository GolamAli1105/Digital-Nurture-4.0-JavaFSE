package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Calculator;

class Exercise2 {

	Calculator calc = new Calculator();
	
	@Test
	public void testAdd() {
		assertEquals(5,calc.add(2,3));
	}
	
	@Test
	public void testSubtract() {
		assertEquals(1,calc.subtract(4,3));
	}

}
