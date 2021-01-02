package com.exhlim.springdependencyinjection.controllers;

import com.exhlim.springdependencyinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
	@Qualifier("propertyInjectedGreetingService")
	/** This tells spring to inject an instance of this component **/
	@Autowired
	public GreetingService greetingService;

	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
