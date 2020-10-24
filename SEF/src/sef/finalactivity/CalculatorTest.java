package sef.finalactivity;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	Calculator calc = new Calculator();
	
	@Test
	public void multTest() {
		double result = calc.mult(10, 20);
		assertTrue(200 == result);
	}	
		
	@Test
	public void divTest() {
		double result = calc.div(20, 20);
		assertTrue(1 == result);
	}	
	@Test
	public void sumTest() {
		double result = calc.sum(20, 20);
		assertTrue(40 == result);
	}	
	@Test
	public void diffTest() {
		double result = calc.diff(20, 20);
		assertTrue(0 == result);
	}	

}
