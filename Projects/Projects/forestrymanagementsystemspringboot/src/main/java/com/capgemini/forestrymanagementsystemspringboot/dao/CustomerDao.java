package com.capgemini.forestrymanagementsystemspringboot.dao;

import java.util.List;

import com.capgemini.forestrymanagementsystemspringboot.dto.CustomerBean;

public interface CustomerDao {
	

	public CustomerBean auth(String email, String password);
	public boolean register(CustomerBean bean);
	public List<CustomerBean> getAllCustomer();
	public boolean changePassword(int id, String password);
	public boolean deleteCustomer(int id);
	public List<CustomerBean> searchCustomer(int key);

}
