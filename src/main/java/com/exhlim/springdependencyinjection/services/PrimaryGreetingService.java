package com.exhlim.springdependencyinjection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService{
	@Override
	public String sayGreeting() {
		return "Hello World - From the PRIMARY BEAN";
	}
}
