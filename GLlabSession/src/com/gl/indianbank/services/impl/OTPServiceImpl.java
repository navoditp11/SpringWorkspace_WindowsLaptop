package com.gl.indianbank.services.impl;

import com.gl.indianbank.services.OTPservice;

public class OTPServiceImpl implements OTPservice {

	@Override
	public int generateOTP() {
		// TODO Auto-generated method stub
		return (int)(Math.random()*9000)+1000;
	}
	
	
}
