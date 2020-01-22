package com.capgemini.forestrymanagementsystemjdbc.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class LoginBean implements Serializable {
	private String login_id;
	private String password;

}
