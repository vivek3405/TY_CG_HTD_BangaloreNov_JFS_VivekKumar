package com.capgemini.forestrymanagementsystemspringrest.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capgemini.forestrymanagementsystemspringrest.dto.ProductResponse;
import com.capgemini.forestrymanagementsystemspringrest.exception.LoginException;
import com.capgemini.forestrymanagementsystemspringrest.exception.ProductException;

@RestControllerAdvice
public class ProductControllerAdvice {
	
	@ExceptionHandler(LoginException.class)
	public ProductResponse handleProductException(ProductException e) {
		ProductResponse response = new ProductResponse();
		response.setStatusCode(501);
		response.setMessage("Exception");
		response.setDescription(e.getMessage());
		return response;
	}

}
