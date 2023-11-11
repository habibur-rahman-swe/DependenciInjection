package com.habib.spring5.controller;

import org.springframework.stereotype.Controller;

import com.habib.spring5.services.EnvironmentService;

@Controller
public class EnvironmentController {

	private final EnvironmentService environmentService;

	public EnvironmentController(EnvironmentService environmentService) {
		this.environmentService = environmentService;
	}
	
	public String sayHello() {
		return environmentService.getEnv();
	}
	
}
