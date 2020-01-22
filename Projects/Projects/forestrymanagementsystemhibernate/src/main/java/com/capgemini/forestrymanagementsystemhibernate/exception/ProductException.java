package com.capgemini.forestrymanagementsystemhibernate.exception;

@SuppressWarnings("serial")
public class ProductException extends RuntimeException {

	String message;

	public ProductException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}
}
