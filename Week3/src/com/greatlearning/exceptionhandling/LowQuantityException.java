package com.greatlearning.exceptionhandling;

public class LowQuantityException extends RuntimeException{
	public LowQuantityException(String errorMsg) {
		super(errorMsg);
	}

}
