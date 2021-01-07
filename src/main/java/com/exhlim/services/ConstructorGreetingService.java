package com.exhlim.services;

import org.springframework.stereotype.Service;
/** Adding service annotation which tells spring this is a Spring Managed component and to bring this into the spring context **/
/** When you want to have more than 1 implementation add the @Qualifier annotation **/
@Service
public class ConstructorGreetingService implements GreetingService {
	@Override
	public String sayGreeting() {
		return "Hello World -- Constructor ";
	}
}
