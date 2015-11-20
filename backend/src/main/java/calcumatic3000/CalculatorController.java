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
	
	@RequestMapping(value="/addition/{a}/{b}", produces="application/json") 
	@ResponseBody
	public Calculation addition(@PathVariable("a") Integer a, @PathVariable("b") Integer b) {
		return new Calculation("addition", a, b, Integer.toString(calculator.add(a, b)));
	}
	
	@RequestMapping(value="/subtraction/{a}/{b}")
	@ResponseBody
	public Calculation subtraction(@PathVariable("a") Integer a, @PathVariable("b") Integer b) {
		return new Calculation("subtraction", a, b, Integer.toString(calculator.subtract(a, b)));
	}
	
	@RequestMapping("/multiplication/{a}/{b}")
	@ResponseBody
	public Calculation multiplication(@PathVariable("a") Integer a, @PathVariable("b") Integer b) {
		return new Calculation("multiplication", a, b, Integer.toString(calculator.multiply(a, b)));
	}
	
	@RequestMapping("/division/{a}/{b}")
	@ResponseBody
	public Calculation division(@PathVariable("a") Integer a, @PathVariable("b") Integer b) {
		return new Calculation("division", a, b, Double.toString(calculator.divide(a, b)));
	}
}
