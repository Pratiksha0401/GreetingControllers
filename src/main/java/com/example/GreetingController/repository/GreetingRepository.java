package com.example.GreetingController.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.GreetingController.entity.Greeting;

public interface GreetingRepository extends JpaRepository<Greeting,Long> {


}
