package com.habib.spring5.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.habib.spring5.services.GreetingServiceImpl;

public class PropertyInjectedControllerTest {
	
	PropertyInjectedController propertyInjectedController;
	
	@BeforeEach
	void setUp() {
		propertyInjectedController = new PropertyInjectedController();
		propertyInjectedController.greetingService = new GreetingServiceImpl();
	}
	
	@Test
	void sayHello() {
		System.out.println(propertyInjectedController.sayHello());
	}
	
}
