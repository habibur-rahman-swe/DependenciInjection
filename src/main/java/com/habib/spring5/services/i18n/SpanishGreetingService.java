package com.habib.spring5.services.i18n;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.habib.spring5.services.GreetingService;

@Profile("ES")
@Service("i18NService")
public class SpanishGreetingService implements GreetingService {
	@Override
	public String sayGreeting() {
		return "Hola Mundo - ES";
	}
}
