package com.habib.spring5.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
public class GreetingServicePrimary implements GreetingService{

	@Override
	public String sayGreeting() {
		return "I'm Greeting Service Primary";
	}

	
}
