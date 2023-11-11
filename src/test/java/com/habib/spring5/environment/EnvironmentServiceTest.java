package com.habib.spring5.environment;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.habib.spring5.services.EnvironmentService;


@SpringBootTest
@ActiveProfiles({"prod", "ES"})
// default থাকলে কিছু দিতে হবে না। নইলে সব profile সেট করে দিতে হবে।
public class EnvironmentServiceTest {

	@Autowired
	EnvironmentService environmentService;
	
	
	@Test
	void sayHello() {
		System.out.println(environmentService.getEnv());
	}
}
