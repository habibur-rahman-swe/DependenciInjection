package com.habib.spring5.controller;

import com.habib.spring5.services.GreetingService;

public class ConstructorInjectedController {
	private final GreetingService greetingService;
	
	public ConstructorInjectedController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
}
