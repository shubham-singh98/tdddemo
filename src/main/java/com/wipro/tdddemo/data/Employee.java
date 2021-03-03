package com.wipro.tdddemo.data;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Employee implements Serializable {

	private static final long serialVersionUID = -5125993830187697697L;
	
	private String name;
	private String surname;
	private String employeeId;

}
