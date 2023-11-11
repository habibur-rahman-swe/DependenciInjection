package com.habib.spring5.controller;

import org.springframework.beans.factory.annotation.Qualifier;

import com.habib.spring5.services.GreetingService;

public class ConstructorInjectedController {
	private final GreetingService greetingService;
	
	public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
}
