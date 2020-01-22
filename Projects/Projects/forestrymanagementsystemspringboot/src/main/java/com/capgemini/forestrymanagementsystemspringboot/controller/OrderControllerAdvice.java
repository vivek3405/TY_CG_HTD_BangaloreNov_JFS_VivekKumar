package com.capgemini.forestrymanagementsystemspringboot.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capgemini.forestrymanagementsystemspringboot.dto.OrderResponse;
import com.capgemini.forestrymanagementsystemspringboot.exception.OrderException;

@RestControllerAdvice
public class OrderControllerAdvice {
	
	@ExceptionHandler(OrderException.class)
	public OrderResponse handleOrderException(OrderException e) {
		OrderResponse response = new OrderResponse();
		response.setStatusCode(501);
		response.setMessage("Exception");
		response.setDescription(e.getMessage());
		return response;
	}

}
