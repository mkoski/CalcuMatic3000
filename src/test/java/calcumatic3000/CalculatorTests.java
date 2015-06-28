package calcumatic3000;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTests {
	
	@Test
	public void additionTest() {
		Calculator calc = new Calculator();
		assertEquals("0+0 must equal 0", 0, calc.addition(0, 0));
		assertEquals("2+3 must equal 5", 5, calc.addition(2, 3));
		assertEquals("2+(-3) must equal -1", -1, calc.addition(2, -3));
	}
	
	@Test
	public void subtractionTest() {
		Calculator calc = new Calculator();
		assertEquals("0-0 must equal 0", 0, calc.subtraction(0, 0));
		assertEquals("3-1 must equal 2", 2, calc.subtraction(3, 1));
		assertEquals("-1-(-4) must equal 3", 3, calc.subtraction(-1, -4));
	}
	
	@Test
	public void multiplicationTest() {
		Calculator calc = new Calculator();
		assertEquals("0*0 must equal 0", 0, calc.multiplication(0, 0));
		assertEquals("1*1 must equal 1", 1, calc.multiplication(1, 1));
		assertEquals("1*(-1) must equal -1", -1, calc.multiplication(1, -1));
		assertEquals("-1*(-1) must equal 1", 1, calc.multiplication(-1, -1));
		assertEquals("2*3 must equal 6", 6, calc.multiplication(2, 3));
	}
	
	@Test
	public void divisionTest() {
		Calculator calc = new Calculator();
		assertEquals("1/1 must equal 1", 1, calc.division(1, 1), 0.1);
		assertEquals("6/2 must equal 3", 3, calc.division(6, 2), 0.1);
	}
	
	@Test
	public void divisionByZeroShouldThrowArithmeticException() {
		Calculator calc = new Calculator();
		try {
			calc.division(2,0);
			fail("Should throw ArithmeticException");
		}
		catch(ArithmeticException e) {
			// Divided by zero
		}
	}

}
