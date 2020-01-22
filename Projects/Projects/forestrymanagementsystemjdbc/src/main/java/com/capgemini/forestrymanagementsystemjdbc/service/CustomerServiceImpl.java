package com.capgemini.forestrymanagementsystemjdbc.service;

import java.util.List;

import com.capgemini.forestrymanagementsystemjdbc.dao.CustomerDao;
import com.capgemini.forestrymanagementsystemjdbc.dto.CustomerBean;
import com.capgemini.forestrymanagementsystemjdbc.factory.FmsFactory;


public class CustomerServiceImpl implements CustomerService {
	CustomerDao dao=FmsFactory.instanceOfCustomerDaoImpl();

	@Override
	public boolean addCustomer(CustomerBean bean) {
		return dao.addCustomer(bean);
	}

	@Override
	public boolean searchCustomer(int custid) {
		return dao.searchCustomer(custid);
	}

	@Override
	public boolean deleteCustomer(int custid) {
		return dao.deleteCustomer(custid);
	}

	@Override
	public boolean modifyMobile(int custid, String number) {
		return dao.modifyMobile(custid, number);
	}

	@Override
	public List<CustomerBean> getAllCustomer() {
		return dao.getAllCustomer();
	}

	@Override
	public String login(String email, String password) {
		return dao.login(email, password);
	}

}
