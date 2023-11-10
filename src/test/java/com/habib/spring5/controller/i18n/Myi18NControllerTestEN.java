package com.habib.spring5.controller.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Myi18NControllerTestEN {

	@Autowired
	Myi18NContoller myi18nContoller;

	@Test
	void sayHello() {
		System.out.println(myi18nContoller.sayHello());
	}

}
