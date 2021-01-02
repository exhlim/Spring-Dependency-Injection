package com.exhlim.springdependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/** Here service takes in a qualifier **/
@Profile("ES")
@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingService{
	@Override
	public String sayGreeting() {
		return "OLA ";
	}
}
