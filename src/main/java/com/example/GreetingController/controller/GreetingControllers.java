package com.example.GreetingController.controller;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.GreetingController.entityGreeting.Greeting;
import com.example.GreetingController.service.GreetService;

@RestController
@RequestMapping("/greet")
public class GreetingControllers {
	
	@Autowired 
	GreetService greetService;
	
	private static final String template = " Hello , %s !";
	private final AtomicLong counter = new AtomicLong();
	
	//uc1
	//here we are passing value name ="Pratiksha"
	//curl -X GET "http://localhost:8080/greeting" -w "\n"
	@GetMapping("/Pratiksha")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, "Pratiksha"));
	}
	//uc1
	//here we are not passing any value it will take default value
	// curl -X GET "http://localhost:8080/greet" -w "\n"
	@GetMapping("/world")
	public Greeting greetingWithDefaultValue(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	
	//UC2
	// curl -X GET "http://localhost:8080/greet/get/all"
	@GetMapping("/get/all")
	public List<Greeting> getAll(){
		return greetService.getAll();
	}
}
