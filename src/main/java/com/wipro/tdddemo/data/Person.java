package com.wipro.tdddemo.data;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Person implements Serializable {
	
	private static final long serialVersionUID = 6453193150377664286L;
	
	private String name;
	private String surname;
	private Integer age;
	
}
