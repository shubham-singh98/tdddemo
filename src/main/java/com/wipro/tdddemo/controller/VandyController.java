package com.wipro.tdddemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.tdddemo.data.Employee;
import com.wipro.tdddemo.service.EmployeeService;

@RestController
public class VandyController {

	private EmployeeService es = new EmployeeService();

	@GetMapping("/employee/{id}")
	public ResponseEntity<Employee> sayHello(@PathVariable String id) {
		Employee employee = es.getbyEmployeeId(id);
		if (employee != null) {
			return new ResponseEntity<>(employee, HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

}
