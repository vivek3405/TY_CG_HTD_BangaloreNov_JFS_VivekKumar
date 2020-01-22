package com.capgemini.forestrymanagementsystemjdbc.service;

import com.capgemini.forestrymanagementsystemjdbc.dao.LoginDao;
import com.capgemini.forestrymanagementsystemjdbc.factory.FmsFactory;

public class LoginServiceImpl implements LoginService{
	
	LoginDao dao=FmsFactory.instanceOfLoginDaoImpl();
	@Override
	public String loginAdmin(String id, String password) {
		return dao.loginAdmin(id, password);
	}

}
