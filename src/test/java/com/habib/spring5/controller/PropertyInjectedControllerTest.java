package com.habib.spring5.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PropertyInjectedControllerTest {
	
	@Autowired
	PropertyInjectedController propertyInjectedController;

	@Test
	void sayHello() {
		System.out.println(propertyInjectedController.sayHello());
	}

}
