package com.habib.spring5.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service

public class EnvironmentServiceUat implements EnvironmentService{

	@Override
	public String getEnv() {
		// TODO Auto-generated method stub
		return "I'm in UAT environment";
	}
	

}
