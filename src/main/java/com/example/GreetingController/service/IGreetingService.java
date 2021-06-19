package com.example.GreetingController.service;

import com.example.GreetingController.entity.Greeting;
import com.example.GreetingController.entity.User;

public interface IGreetingService {

	public Greeting addGreeting(User user);

}
