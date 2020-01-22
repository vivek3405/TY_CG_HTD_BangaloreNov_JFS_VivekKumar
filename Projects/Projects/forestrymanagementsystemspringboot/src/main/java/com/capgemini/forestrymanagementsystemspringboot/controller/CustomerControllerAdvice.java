package com.capgemini.forestrymanagementsystemspringboot.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capgemini.forestrymanagementsystemspringboot.dto.CustomerResponse;
import com.capgemini.forestrymanagementsystemspringboot.exception.CustomerException;

@RestControllerAdvice
public class CustomerControllerAdvice {
	@ExceptionHandler(CustomerException.class)
	public CustomerResponse handleCustomerException(CustomerException e) {
		CustomerResponse response = new CustomerResponse();
		response.setStatusCode(501);
		response.setMessage("Exception");
		response.setDescription(e.getMessage());
		return response;
	}

}