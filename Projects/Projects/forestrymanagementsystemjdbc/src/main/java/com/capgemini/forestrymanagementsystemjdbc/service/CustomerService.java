package com.capgemini.forestrymanagementsystemjdbc.service;

import java.util.List;

import com.capgemini.forestrymanagementsystemjdbc.dto.CustomerBean;

public interface CustomerService {
	public boolean addCustomer(CustomerBean bean);
	public boolean searchCustomer(int custid);
	public boolean deleteCustomer(int custid);
	public boolean modifyMobile(int custid, String number);
	public List<CustomerBean> getAllCustomer();
	public String login(String email, String password);
}
