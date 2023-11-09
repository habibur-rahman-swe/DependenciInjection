package com.habib.spring5.controller;

import com.habib.spring5.services.GreetingService;

public class SetterInjectedController {
	private GreetingService greetingService;
	
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
}
