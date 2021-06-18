package com.example.GreetingController;

<<<<<<< HEAD
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GreetingControllerApplication {

=======
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
	
>>>>>>> 7a9fe0109f633c1511944f0c8e897de24aed5060
	public static void main(String[] args) {
		SpringApplication.run(GreetingControllerApplication.class, args);
	}

<<<<<<< HEAD
=======
	@Override
	public void run(String... args) throws Exception {
		Greeting greet1 = new Greeting(1,"Hello World !"); 
		
		greetRepositary.greeting.addAll(Arrays.asList(greet1));
	}
	
>>>>>>> 7a9fe0109f633c1511944f0c8e897de24aed5060
}
