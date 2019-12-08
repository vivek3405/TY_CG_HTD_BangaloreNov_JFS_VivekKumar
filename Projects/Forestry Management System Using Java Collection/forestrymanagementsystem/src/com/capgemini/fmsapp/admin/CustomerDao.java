package com.capgemini.fmsapp.admin;

import java.util.*;

import com.capgemini.fmsapp.client.CustomerBean;

public interface CustomerDao {
	
	public boolean addCustomer(CustomerBean bean);
	public boolean searchCustomer(int custid, Map<Integer, List<CustomerBean>> m);
	public boolean deleteCustomer(int custid, Map<Integer, List<CustomerBean>> m);
	public List<CustomerBean> getAllCustomer();

}
