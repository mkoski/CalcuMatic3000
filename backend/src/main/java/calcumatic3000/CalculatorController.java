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
		return new Calculation("addition", a, b, Integer.toString(calculator.addition(a, b)));
	}
	
	@RequestMapping(value="/subtraction/{a}/{b}")
	@ResponseBody
	public Calculation subtraction(@PathVariable("a") Integer a, @PathVariable("b") Integer b) {
		return new Calculation("subtraction", a, b, Integer.toString(calculator.subtraction(a, b)));
	}
	
	@RequestMapping("/multiplication/{a}/{b}")
	@ResponseBody
	public Calculation multiplication(@PathVariable("a") Integer a, @PathVariable("b") Integer b) {
		return new Calculation("multiplication", a, b, Integer.toString(calculator.multiplication(a, b)));
	}
	
	@RequestMapping("/division/{a}/{b}")
	@ResponseBody
	public Calculation division(@PathVariable("a") Integer a, @PathVariable("b") Integer b) {
		return new Calculation("division", a, b, Double.toString(calculator.division(a, b)));
	}
}
