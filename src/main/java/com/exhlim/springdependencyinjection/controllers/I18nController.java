package com.exhlim.springdependencyinjection.controllers;

import com.exhlim.springdependencyinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
/** I18n means internationlization controller**/
public class I18nController {

	private final GreetingService greetingService;

	public I18nController(@Qualifier("i18nService") GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String sayHello() {
		return greetingService.sayGreeting();
	}
}
