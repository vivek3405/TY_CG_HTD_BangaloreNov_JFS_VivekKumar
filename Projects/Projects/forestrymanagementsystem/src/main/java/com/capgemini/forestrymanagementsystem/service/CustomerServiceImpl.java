package com.capgemini.forestrymanagementsystem.service;

import java.util.List;
import java.util.Map;

import com.capgemini.forestrymanagementsystem.dao.CustomerDao;
import com.capgemini.forestrymanagementsystem.dto.CustomerBean;
import com.capgemini.forestrymanagementsystem.factory.FmsFactory;

public class CustomerServiceImpl implements CustomerService {
	
	CustomerDao dao=FmsFactory.instanceOfCustomerDaoImpl();

	@Override
	public boolean addCustomer(CustomerBean bean) {
		
		return dao.addCustomer(bean);
	}

	@Override
	public boolean searchCustomer(int custid, Map<Integer, List<CustomerBean>> list) {
		
		return dao.searchCustomer(custid, list);
	}

	@Override
	public boolean deleteCustomer(int custid, Map<Integer, List<CustomerBean>> list) {
		
		return dao.deleteCustomer(custid, list);
	}

	@Override
	public List<CustomerBean> getAllCustomer() {
		
		return dao.getAllCustomer();
	}

}
