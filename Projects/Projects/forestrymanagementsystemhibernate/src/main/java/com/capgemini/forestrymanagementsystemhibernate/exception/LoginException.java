package com.capgemini.forestrymanagementsystemhibernate.exception;

@SuppressWarnings("serial")
public class LoginException extends Exception {

	String message;

	public LoginException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}

}
