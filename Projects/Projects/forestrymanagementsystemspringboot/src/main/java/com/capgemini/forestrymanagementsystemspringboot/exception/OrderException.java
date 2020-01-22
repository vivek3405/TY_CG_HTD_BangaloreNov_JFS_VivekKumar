package com.capgemini.forestrymanagementsystemspringboot.exception;

@SuppressWarnings("serial")
public class OrderException extends RuntimeException{

	public OrderException(String message) {
		super(message);
		
	}
}
