package calcumatic3000;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTests {
	
	@Test
	public void additionTest() {
		Calculator calc = new Calculator();
		assertEquals("0+0 must equal 0", 0, calc.add(0, 0));
		assertEquals("2+3 must equal 5", 5, calc.add(2, 3));
		assertEquals("2+(-3) must equal -1", -1, calc.add(2, -3));
	}
	
	@Test
	public void subtractionTest() {
		Calculator calc = new Calculator();
		assertEquals("0-0 must equal 0", 0, calc.subtract(0, 0));
		assertEquals("3-1 must equal 2", 2, calc.subtract(3, 1));
		assertEquals("-1-(-4) must equal 3", 3, calc.subtract(-1, -4));
	}
	
	@Test
	public void multiplicationTest() {
		Calculator calc = new Calculator();
		assertEquals("0*0 must equal 0", 0, calc.multiply(0, 0));
		assertEquals("1*1 must equal 1", 1, calc.multiply(1, 1));
		assertEquals("1*(-1) must equal -1", -1, calc.multiply(1, -1));
		assertEquals("-1*(-1) must equal 1", 1, calc.multiply(-1, -1));
		assertEquals("2*3 must equal 6", 6, calc.multiply(2, 3));
	}
	
	@Test
	public void divisionTest() {
		Calculator calc = new Calculator();
		assertEquals("1/1 must equal 1", 1, calc.divide(1, 1), 0.1);
		assertEquals("6/2 must equal 3", 3, calc.divide(6, 2), 0.1);
	}
	
	@Test(expected=ArithmeticException.class)
	public void divisionByZeroShouldThrowArithmeticException() {
		Calculator calc = new Calculator();
		calc.divide(1, 0);
	}
}
