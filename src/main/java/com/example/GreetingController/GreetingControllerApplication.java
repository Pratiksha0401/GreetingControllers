package com.example.GreetingController;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.GreetingController.entityGreeting.Greeting;
import com.example.GreetingController.repositary.GreetRepositary;

@SpringBootApplication
public class GreetingControllerApplication implements CommandLineRunner{
	
	@Autowired
	GreetRepositary greetRepositary;
	
	public static void main(String[] args) {
		SpringApplication.run(GreetingControllerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Greeting greet1 = new Greeting(1,"Hello World !"); 
		
		greetRepositary.greeting.addAll(Arrays.asList(greet1));
	}
	
}
