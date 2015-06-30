package calcumatic3000;

import org.springframework.stereotype.Service;

@Service
public class Calculator {

	public int addition(int a, int b) {
		return a + b;
	}
	
	public int subtraction(int a, int b) {
		return a - b;
	}
	
	public int multiplication (int a, int b) {
		return a * b;
	}
	
	public double division(int a, int b) {
		if(b == 0) {
			throw new ArithmeticException("Divided by zero.");
		}
		return (double)a / b;
	}
}
