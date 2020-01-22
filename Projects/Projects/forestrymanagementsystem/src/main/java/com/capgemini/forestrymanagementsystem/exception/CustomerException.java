package com.capgemini.forestrymanagementsystem.exception;

@SuppressWarnings("serial")
public class CustomerException extends RuntimeException {
	String message;

	public CustomerException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}

}
