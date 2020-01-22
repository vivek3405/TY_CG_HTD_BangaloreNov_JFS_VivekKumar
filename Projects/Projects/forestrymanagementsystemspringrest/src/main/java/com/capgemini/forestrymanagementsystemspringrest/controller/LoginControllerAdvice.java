package com.capgemini.forestrymanagementsystemspringrest.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capgemini.forestrymanagementsystemspringrest.dto.LoginResponse;
import com.capgemini.forestrymanagementsystemspringrest.exception.LoginException;

@RestControllerAdvice
public class LoginControllerAdvice {
	@ExceptionHandler(LoginException.class)
	public LoginResponse handleLoginException(LoginException e) {
		LoginResponse response = new LoginResponse();
		response.setStatusCode(501);
		response.setMessage("Exception");
		response.setDescription(e.getMessage());
		return response;
	}

}
