package com.habib.spring5.controller;

import org.springframework.stereotype.Controller;

import com.habib.spring5.services.GreetingService;
import com.habib.spring5.services.GreetingServiceImpl;

@Controller
public class MyController {
	
	private final GreetingService greetingService;
	
	public MyController() {
		this.greetingService = new GreetingServiceImpl();
	}
	
	public String sayHello() {
		System.out.println("I am in my Controller");
		
		return greetingService.sayGreeting();
	}
}
