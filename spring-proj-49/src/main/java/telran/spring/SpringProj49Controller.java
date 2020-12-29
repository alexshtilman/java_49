package telran.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringProj49Controller {

	
	@GetMapping("/calculator/add")
	int sum (int val1,int val2) {
		return val1+val2;
	}
	
}
