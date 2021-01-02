package com.exhlim.springdependencyinjection.controllers;

import com.exhlim.springdependencyinjection.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class Testing {
	/** Implement a generic greeting service here, primary bean annotation takes over when there are more than 1 bean
	 * 	When defining greetingService, spring doesnt know which bean to inject into this class
	 * 	So you will either need to define a @Qualifier annotation or @Primary annotation on the beans
	 * **/
	private final GreetingService greetingService;


	public Testing(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String getGreeting() {
		return "ASHDIUAUSDHA" + greetingService.sayGreeting();
	}
}
