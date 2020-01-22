package com.capgemini.forestrymanagementsystemspringrest.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.forestrymanagementsystemspringrest.dto.LoginBean;
import com.capgemini.forestrymanagementsystemspringrest.dto.LoginResponse;
import com.capgemini.forestrymanagementsystemspringrest.service.LoginService;

@RestController
public class LoginController {
	
	@Autowired
	private LoginService service;
	
	@PostMapping(path = "/login-user", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public LoginResponse auth(@RequestBody LoginBean bean) {

		LoginBean loginBean= service.auth(bean.getEmail(), bean.getPassword());
		LoginResponse response=new LoginResponse();
		if(loginBean!=null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Customer found for the credentials");
			response.setLogin(Arrays.asList(loginBean));
		}else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("Credentials invalid");
		}
		return response;
	}
	@PostMapping(path = "/add-user", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public LoginResponse registerUser(@RequestBody LoginBean bean) {
		LoginResponse response=new LoginResponse();
		if(service.register(bean)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("registered successfully");
		}else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("Email already exists");
		}
		return response;

	}

}
