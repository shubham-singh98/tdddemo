package com.wipro.tdddemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.tdddemo.data.Person;

@RestController
public class HelloController {

	@GetMapping("/")
	public ResponseEntity<Person> sayHello() {
		return new ResponseEntity<>(new Person("Vandy", "Gurumoorthy", 15), HttpStatus.OK);
	}

}
