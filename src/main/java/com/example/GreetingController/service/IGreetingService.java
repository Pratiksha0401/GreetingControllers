package com.example.GreetingController.service;

import java.util.List;

import com.example.GreetingController.entity.Greeting;
import com.example.GreetingController.entity.User;

public interface IGreetingService {

	public Greeting addGreeting(User user);
	public Greeting getGreetingById(long id);
	public List<Greeting> getAllGreetings();
}
