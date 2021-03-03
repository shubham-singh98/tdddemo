package com.wipro.tdddemo.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

class VandyControllerTest {

	VandyController vc = new VandyController();
	
	@Test
	void test() {
		Assertions.assertNotNull(vc.sayHello("a313239"));
		Assertions.assertEquals(HttpStatus.OK, vc.sayHello("a313239").getStatusCode());
		Assertions.assertEquals("Gurumoorthy", vc.sayHello("a313239").getBody().getSurname());
		
	}

	@Test
	void testInvalid() {
		Assertions.assertEquals(HttpStatus.NOT_FOUND, vc.sayHello("a313238").getStatusCode());
	}
}
