package com.habib.spring5.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service

public class EnvironmentServiceQA implements EnvironmentService {

	@Override
	public String getEnv() {
		// TODO Auto-generated method stub
		return "I'm in QA  Environment";
	}

}
