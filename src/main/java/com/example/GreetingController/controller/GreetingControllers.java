package com.example.GreetingController.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.GreetingController.entity.Greeting;
import com.example.GreetingController.entity.User;
import com.example.GreetingController.service.IGreetingService;

@RestController
@RequestMapping("/greeting")
public class GreetingControllers {
	
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@Autowired
	private IGreetingService greetingService;
	
	//UC-2
	@GetMapping(value={"","/", "/home"})
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		User user = new User();
		user.setFirstName(name);
		return greetingService.addGreeting(user);
		
	}

}
