package com.capgemini.forestrymanagementsystemspringrest.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capgemini.forestrymanagementsystemspringrest.dto.ContractResponse;
import com.capgemini.forestrymanagementsystemspringrest.exception.CustomerException;

@RestControllerAdvice
public class ContractControllerAdvice {
	
	@ExceptionHandler(CustomerException.class)
	public ContractResponse handleCustomerException(CustomerException e) {
		ContractResponse response = new ContractResponse();
		response.setStatusCode(501);
		response.setMessage("Exception");
		response.setDescription(e.getMessage());
		return response;
	}

}
