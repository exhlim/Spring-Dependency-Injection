package com.exhlim.springdependencyinjection.controllers;

import com.exhlim.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {
	SetterInjectedController controller;

  @BeforeEach
  void setUp() {
  	controller = new SetterInjectedController();
  	/** Using setter to inject the service implementation **/
  	controller.setGreetingService(new ConstructorGreetingService());

	}

  @Test
  void setGreetingService() {
    System.out.println(controller.getGreeting());
	}
}