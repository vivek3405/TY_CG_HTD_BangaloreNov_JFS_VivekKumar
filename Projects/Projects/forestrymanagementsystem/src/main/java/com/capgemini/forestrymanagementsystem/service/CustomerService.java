package com.capgemini.forestrymanagementsystem.service;

import java.util.List;
import java.util.Map;

import com.capgemini.forestrymanagementsystem.dto.CustomerBean;

public interface CustomerService {
	
	public boolean addCustomer(CustomerBean bean);
	public boolean searchCustomer(int custid, Map<Integer, List<CustomerBean>> m);
	public boolean deleteCustomer(int custid, Map<Integer, List<CustomerBean>> m);
	public List<CustomerBean> getAllCustomer();

}
