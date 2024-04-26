package com.greatlearning.exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionHandlingDemo3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Roll No., Name & Percentage separated by space ");
		String input = br.readLine();
		System.out.println(input);

	}

}
