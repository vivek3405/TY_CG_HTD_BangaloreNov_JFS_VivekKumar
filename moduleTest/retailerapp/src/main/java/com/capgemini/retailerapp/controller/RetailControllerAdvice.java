package com.capgemini.retailerapp.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capgemini.retailerapp.dto.UserInfoResponse;
import com.capgemini.retailerapp.exception.UserInfoException;

@RestControllerAdvice
public class RetailControllerAdvice {

	@ExceptionHandler(UserInfoException.class)
	public UserInfoResponse handleEmployeeException(UserInfoException e) {
		UserInfoResponse response = new UserInfoResponse();
		response.setStatusCode(501);
		response.setMessage("Exception");
		response.setDiscription(e.getMessage());
		return response;
	}

}
