package com.capgemini.forestrymanagementsystemspringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.capgemini.forestrymanagementsystemspringboot.dao.CustomerDao;
import com.capgemini.forestrymanagementsystemspringboot.dto.CustomerBean;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDao dao;

	@Override
	public CustomerBean auth(String email, String password) {
		return dao.auth(email, password);
	}

	@Override
	public boolean register(CustomerBean bean) {
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		String encodedPassword = encoder.encode(bean.getPassword());
		bean.setPassword(encodedPassword);
		return dao.register(bean);
	}

	@Override
	public List<CustomerBean> getAllCustomer() {
		return dao.getAllCustomer();
	}

	@Override
	public boolean changePassword(int id, String password) {
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		return dao.changePassword(id, encoder.encode(password));
	}

	@Override
	public boolean deleteCustomer(int id) {
		return dao.deleteCustomer(id);
	}

	@Override
	public List<CustomerBean> searchCustomer(int key) {
		return dao.searchCustomer(key);
	}

}
