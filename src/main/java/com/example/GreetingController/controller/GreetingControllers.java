package com.example.GreetingController.controller;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	//  curl "http://localhost:8080/greeting/home?name=Pratiksha" -w "\n"
	@GetMapping(value={"","/", "/home"})
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		User user = new User();
		user.setFirstName(name);
		return greetingService.addGreeting(user);		
	}
	
	//UC3
	@PostMapping("/post")
	public String sayHello(@RequestBody User user) {
		return "Hello " + user.getFirstName() + " " + user.getLastName() + " !!";
	}

	@PutMapping("/put/{firstName}")
	public String sayHello(@PathVariable String firstName,
			               @RequestParam(value="lastName") String lastName) {
		return "Hello" + firstName +" "+ lastName + " !!";
	}
	
	//UC5 To find Greeting Message by Id
	//  curl "http://localhost:8080/greeting/message/1" -w "\n"
	@GetMapping("/message/{id}")
	public Greeting getByid(@PathVariable long id) {
		return greetingService.getGreetingById(id);	
	}
	
	//UC6
	//	curl "http://localhost:8080/greeting/getAll" -w "\n"
	@GetMapping("/getAll")
	public List<Greeting> getAllGreetings() {
		return greetingService.getAllGreetings();	
	}
	

}