package com.gl.emailgenarator.services;

import java.util.Random;

import com.gl.emailgenarator.model.Employee;

public class CredentialServicesImpl implements CredentialService {
	String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String smallLetters = "abcdefghijklmnopqrstuvwxyz";
	String numbers = "0123456789";
	String specialCharacters = "!@#$%^&*_=+-/.?<>)(";

	@Override
	public String generateEmail(String firstName, String lastName, String department) {
		// TODO Auto-generated method stub
		return firstName.toLowerCase() + lastName.toLowerCase() + "@" + department + ".abc.com";

	}

	@Override
	public String generatePassword() {
		// TODO Auto-generated method stub
		String values = capitalLetters + smallLetters + numbers + specialCharacters;

		Random random = new Random();
		char[] password = new char[8];
		for (int i = 0; i < 8; i++) {
			// Use of charAt() method : to get character value
			// Use of nextInt() as it is scanning the value as int
			password[i] = values.charAt(random.nextInt(values.length()));
		}
		return String.valueOf(password);

	}

	@Override
	public void displayCredential(Employee employee) {
		//Employee employee = new Employee();
		System.out.println("Dear " + employee.getFirstName() + ", your generated credentials are as follows");
		System.out.println("Email ---> " + employee.getEmail());
		System.out.println("Password ---> " + employee.getPassword());

	}

}
