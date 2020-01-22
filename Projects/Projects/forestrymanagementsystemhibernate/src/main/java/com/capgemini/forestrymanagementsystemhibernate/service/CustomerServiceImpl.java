package com.capgemini.forestrymanagementsystemhibernate.service;

import java.util.List;

import com.capgemini.forestrymanagementsystemhibernate.dao.CustomerDao;
import com.capgemini.forestrymanagementsystemhibernate.dto.CustomerBean;
import com.capgemini.forestrymanagementsystemhibernate.factory.FmsFactory;

public class CustomerServiceImpl implements CustomerService {

	CustomerDao dao = FmsFactory.instanceOfCustomerDaoImpl();

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
	public String login(int custid, String password) {
		return dao.login(custid, password);
	}

}
