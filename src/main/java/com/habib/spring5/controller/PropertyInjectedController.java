package com.habib.spring5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.habib.spring5.services.GreetingService;

@Controller
public class PropertyInjectedController {
	
	@Autowired
	GreetingService greetingService;
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
}
