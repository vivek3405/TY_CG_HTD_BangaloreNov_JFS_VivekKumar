package com.capgemini.forestrymanagementsystemspringrest.service;

import java.util.List;

import com.capgemini.forestrymanagementsystemspringrest.dto.CustomerBean;

public interface CustomerService {
	
	public CustomerBean auth(String email, String password);
	public boolean register(CustomerBean bean);
	public List<CustomerBean> getAllCustomer();
	public boolean changePassword(int id, String password);
	public boolean deleteCustomer(int id);
	public List<CustomerBean> searchCustomer(int key);

}
