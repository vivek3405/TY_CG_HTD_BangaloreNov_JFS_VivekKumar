package com.capgemini.forestrymanagementsystemspringboot.exception;

@SuppressWarnings("serial")
public class LoginException  extends RuntimeException{
	
	public LoginException(String message) {
		super(message);
	}

}
