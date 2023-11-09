package com.habib.spring5.controller.i18n;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.habib.spring5.services.GreetingService;

@Controller
public class Myi18NContoller {
	private final GreetingService greetingService;
	
	public Myi18NContoller(@Qualifier("i18NService") GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
}
