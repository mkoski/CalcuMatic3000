package calcumatic3000;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class CalculatorController {
	
	@Autowired
	private Calculator calculator;
	
	@RequestMapping("/")
	public String index() {
		return "This is working.";
	}
	
	@RequestMapping("/addition/{a}/{b}") 
	public String addition(@PathVariable("a") Integer a, @PathVariable("b") Integer b) {
		return Integer.toString(calculator.addition(a, b));
	}
	
	@RequestMapping("/subtraction/{a}/{b}")
	public String subtraction(@PathVariable("a") Integer a, @PathVariable("b") Integer b) {
		return Integer.toString(calculator.subtraction(a, b));
	}
	
	@RequestMapping("/multiplication/{a}/{b}")
	public String multiplication(@PathVariable("a") Integer a, @PathVariable("b") Integer b) {
		return Integer.toString(calculator.multiplication(a, b));
	}
	
	@RequestMapping("/division/{a}/{b}")
	public String division(@PathVariable("a") Integer a, @PathVariable("b") Integer b) {
		return Double.toString(calculator.division(a, b));
	}
}
