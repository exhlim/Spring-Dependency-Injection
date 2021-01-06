package com.exhlim.springdependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/** Here service takes in a qualifier
 * profile can take more than 1 active profile
 * **/
@Profile({"ES", "default"})
@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingService{
	@Override
	public String sayGreeting() {
		return "OLA ";
	}
}
