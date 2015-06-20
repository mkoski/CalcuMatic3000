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
	
	@RequestMapping("/sum") 
	public String getSum() {
		return Integer.toString(calculator.Sum(1, 2));
	}
}
