package com.capgemini.forestrymanagementsystemspringboot.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capgemini.forestrymanagementsystemspringboot.dto.ContractResponse;
import com.capgemini.forestrymanagementsystemspringboot.exception.CustomerException;

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
