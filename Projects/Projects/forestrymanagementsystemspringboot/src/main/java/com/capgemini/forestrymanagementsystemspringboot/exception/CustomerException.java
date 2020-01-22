package com.capgemini.forestrymanagementsystemspringboot.exception;

@SuppressWarnings("serial")
public class CustomerException extends RuntimeException {
	
	public CustomerException(String message) {
		super(message);
	}

}
