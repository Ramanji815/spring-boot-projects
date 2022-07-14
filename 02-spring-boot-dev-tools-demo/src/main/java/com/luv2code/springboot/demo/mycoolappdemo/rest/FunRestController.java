package com.luv2code.springboot.demo.mycoolappdemo.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

	// return the hello word
	@GetMapping("/")
	public String sayHello() {

		return "Hello World ! time on the server is : " + LocalDateTime.now();
	}

	// adding new end point for workout
	@GetMapping("/workout")
	public String getDailyWorkout() {

		return "Daily work out should be 30 minutes";
	}

}
