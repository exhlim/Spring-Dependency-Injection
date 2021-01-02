package com.exhlim.springdependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/** Here service takes in a qualifier
 * Here we have added different profiles for different services under the same qualifier names
 * You are also required to add "spring.profiles.active={profileAnnotationName}" to the application.properties to define your current profile that you are using
 * Behind the scenes the inactive profiles will not be loaded into the context
 * **/
@Profile("EN")
@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService{
	@Override
	public String sayGreeting() {
		return "Hello";
	}
}
