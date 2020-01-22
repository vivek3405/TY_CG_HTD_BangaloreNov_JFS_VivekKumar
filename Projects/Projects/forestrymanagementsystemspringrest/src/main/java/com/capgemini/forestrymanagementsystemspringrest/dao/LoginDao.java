package com.capgemini.forestrymanagementsystemspringrest.dao;

import com.capgemini.forestrymanagementsystemspringrest.dto.LoginBean;

public interface LoginDao {
	
	public LoginBean auth(String email, String password);
	public boolean register(LoginBean bean);
}
