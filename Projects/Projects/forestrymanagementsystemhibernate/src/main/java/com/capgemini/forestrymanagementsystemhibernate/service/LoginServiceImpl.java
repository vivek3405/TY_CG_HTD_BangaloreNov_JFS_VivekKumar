package com.capgemini.forestrymanagementsystemhibernate.service;

import com.capgemini.forestrymanagementsystemhibernate.dao.LoginDao;
import com.capgemini.forestrymanagementsystemhibernate.factory.FmsFactory;

public class LoginServiceImpl implements LoginService {

	LoginDao dao = FmsFactory.instanceOfLoginDaoImpl();

	@Override
	public String loginAdmin(String id, String password) {
		return dao.loginAdmin(id, password);
	}

}
