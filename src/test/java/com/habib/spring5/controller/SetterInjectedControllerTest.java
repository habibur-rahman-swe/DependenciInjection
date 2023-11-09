package com.habib.spring5.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.habib.spring5.services.GreetingServiceImpl;

public class SetterInjectedControllerTest {
	SetterInjectedController setterInjectedController = new SetterInjectedController();
	
	@BeforeEach
	void setUp() {
		setterInjectedController = new SetterInjectedController();
		setterInjectedController.setGreetingService(new GreetingServiceImpl());
	}
	
	@Test
	void sayHello() {
		System.out.println(setterInjectedController.sayHello());
	}
}
