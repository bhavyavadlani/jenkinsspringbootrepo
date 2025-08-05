package com.klef;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ClientControler {
	@GetMapping("/")
  public String home() {
	  return "CI/CD and cloud DevOps" ;
  }
	@GetMapping("/demo")
	public String demo() {
		return "Jenkins Demo";
	}
}
