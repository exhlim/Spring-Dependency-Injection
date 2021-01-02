package com.exhlim.springdependencyinjection.controllers;

import com.exhlim.springdependencyinjection.services.ConstructorGreetingService;
import com.exhlim.springdependencyinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
	@Qualifier("setterInjectedGreetingService")
	/** This tells spring to inject an instance of this component **/
	@Autowired
	private GreetingService greetingService;

	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
