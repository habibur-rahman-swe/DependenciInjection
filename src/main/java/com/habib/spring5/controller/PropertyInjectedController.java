package com.habib.spring5.controller;

import com.habib.spring5.services.GreetingService;

public class PropertyInjectedController {
	
	GreetingService greetingService;
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
}
