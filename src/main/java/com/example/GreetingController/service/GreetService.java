package com.example.GreetingController.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.GreetingController.entityGreeting.Greeting;
import com.example.GreetingController.repositary.GreetRepositary;

@Service
public class GreetService {
	
	@Autowired 
	GreetRepositary greetRepositary;
	
	public List<Greeting> getAll() {
		return greetRepositary.getAll();
	}

	public String add(Greeting greet) {
		return greetRepositary.add(greet);
	}

}
