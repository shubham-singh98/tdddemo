package com.wipro.tdddemo.service;

import org.springframework.stereotype.Service;

import com.wipro.tdddemo.data.Employee;

@Service
public class EmployeeService {

	public Employee getbyEmployeeId(String empId) {
		if ( empId.equals("a313239") ) {
			return new Employee("Vandy", "Gurumoorthy", empId);
		}
		return null;
	}

}
