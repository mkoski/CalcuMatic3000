package calcumatic3000;

import org.springframework.web.bind.annotation.*;

@RestController
public class CalculatorController {
	@RequestMapping("/")
	public String index() {
		return "This is working.";
	}
}
