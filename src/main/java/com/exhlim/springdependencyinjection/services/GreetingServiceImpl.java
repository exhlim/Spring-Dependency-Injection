package com.exhlim.springdependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
	@Override
	public String sayGreeting() {
		return "Hello World";
	}
}