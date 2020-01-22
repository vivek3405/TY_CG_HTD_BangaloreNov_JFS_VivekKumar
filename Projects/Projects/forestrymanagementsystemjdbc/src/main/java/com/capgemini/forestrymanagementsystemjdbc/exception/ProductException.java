package com.capgemini.forestrymanagementsystemjdbc.exception;

public class ProductException extends RuntimeException{
	
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
