package com.example.GreetingController.Greeting;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingControllers {
	
	private static final String template = " Hello , %s !";
	private final AtomicLong counter = new AtomicLong();
	
	//here we are passing value name="Pratiksha"
	//curl -X GET "http://localhost:8080/greeting" -w "\n"
	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, "Pratiksha"));
	}
	
	//here we are not passing any value it will take default value
	// curl -X GET "http://localhost:8080/greet" -w "\n"
	@GetMapping("/greet")
	public Greeting greetingWithDefaultValue(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
}
