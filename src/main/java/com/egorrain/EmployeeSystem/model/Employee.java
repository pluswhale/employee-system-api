package com.egorrain.EmployeeSystem.model;

import lombok.*;

@NoArgsConstructor
@Getter
@Setter
public class Employee {
	
	private long id;
	private String firstName;
	private String lastName;
	private String emailId;

	public Employee(long id, String firstName, String lastName, String emailId) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
	}
}
