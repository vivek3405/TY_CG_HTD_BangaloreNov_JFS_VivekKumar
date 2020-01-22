package com.capgemini.forestrymanagementsystemhibernate.exception;

@SuppressWarnings("serial")
public class CustomerException extends Exception {
	String message;

	public CustomerException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}

}
