package com.exhlim.springdependencyinjection.controllers;

import com.exhlim.springdependencyinjection.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Service;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {
	SetterInjectedController controller;

  @BeforeEach
  void setUp() {
  	controller = new SetterInjectedController();
  	/** Using setter to inject the service implementation **/
  	controller.setGreetingService(new GreetingServiceImpl());

	}

  @Test
  void setGreetingService() {
    System.out.println(controller.getGreeting());
	}
}