package com.gl.indianbank.test;

import com.gl.indianbank.services.OTPservice;
import com.gl.indianbank.services.impl.*;

public class RandomTest {

	public static void main(String[] args) {
		OTPservice otpService = new OTPServiceImpl();
		System.out.println(otpService.generateOTP());

	}

}
