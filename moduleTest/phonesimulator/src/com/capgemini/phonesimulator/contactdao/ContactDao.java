package com.capgemini.phonesimulator.contactdao;

import java.util.List;

import com.capgemini.phonesimulator.contactdto.Contact;

public interface ContactDao {
	
	public List<Contact> showContact();
	public boolean searchContact(String name);
	public boolean deleteContact(String name);
	public boolean insertContact(Contact user);
	public boolean updateContact(String name, int num);
}