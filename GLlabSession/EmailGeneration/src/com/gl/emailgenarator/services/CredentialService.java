package com.gl.emailgenarator.services;

import com.gl.emailgenarator.model.Employee;

public interface CredentialService {
	public String generateEmail(String firstName, String lastName, String department);
	
	public String generatePassword();
	
	public void displayCredential(Employee employee);

}
