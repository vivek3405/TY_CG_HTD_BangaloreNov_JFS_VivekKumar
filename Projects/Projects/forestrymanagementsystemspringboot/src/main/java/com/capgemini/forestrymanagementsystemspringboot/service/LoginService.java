package com.capgemini.forestrymanagementsystemspringboot.service;

import com.capgemini.forestrymanagementsystemspringboot.dto.LoginBean;

public interface LoginService {
	
	public LoginBean auth(String email, String password);
	public boolean register(LoginBean bean);

}
