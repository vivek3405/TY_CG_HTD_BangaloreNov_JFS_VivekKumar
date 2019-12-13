package com.capgemini.phonesimulator.factory;

import com.capgemini.phonesimulator.contactdao.ContactDao;
import com.capgemini.phonesimulator.contactdao.ContactDaoImpl;

public class ContactFactory {
	
	public static ContactDao instanceOfContactDaoImpl() {
	
	ContactDao dao=new ContactDaoImpl();
	return dao;
	}

}
