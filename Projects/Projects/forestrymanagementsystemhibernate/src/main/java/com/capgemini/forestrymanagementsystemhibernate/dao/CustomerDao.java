package com.capgemini.forestrymanagementsystemhibernate.dao;

import java.util.List;

import com.capgemini.forestrymanagementsystemhibernate.dto.CustomerBean;

public interface CustomerDao {

	public boolean addCustomer(CustomerBean bean);

	public boolean searchCustomer(int custid);

	public boolean deleteCustomer(int custid);

	public boolean modifyMobile(int custid, String number);

	public List<CustomerBean> getAllCustomer();

	public String login(int custid, String password);

}