package com.example.GreetingController.repositary;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.GreetingController.entityGreeting.Greeting;

@Repository
public class GreetRepositary {
	
	public List<Greeting> greeting = new ArrayList<Greeting>();

	public List<Greeting> getAll() {
		return greeting;
	}
}
