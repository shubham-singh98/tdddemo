package com.wipro.tdddemo.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.wipro.tdddemo.data.Person;

class HelloControllerTest {

	private HelloController hc = new HelloController();
	
	@Test
	void test() {
		ResponseEntity<Person> resp = hc.sayHello();
		Assertions.assertNotNull(resp);
		Assertions.assertEquals(HttpStatus.OK, resp.getStatusCode());
		Assertions.assertEquals("Vandy", resp.getBody().getName());
		Assertions.assertEquals("Gurumoorthy", resp.getBody().getSurname());
		Assertions.assertEquals(15, resp.getBody().getAge());
	}

}
