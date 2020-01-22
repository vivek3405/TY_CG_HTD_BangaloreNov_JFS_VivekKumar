package com.capgemini.forestrymanagementsystemspringboot.dto;

import java.util.List;

import lombok.Data;

@Data
public class LoginResponse {
	
	private int statusCode;
	private String message;
	private String description;
	private List<LoginBean> login;

}
