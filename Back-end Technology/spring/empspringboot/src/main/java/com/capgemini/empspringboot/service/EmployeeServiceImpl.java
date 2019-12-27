package com.capgemini.empspringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.capgemini.empspringboot.dto.*;
import com.capgemini.empspringboot.exception.EmployeeException;
import com.capgemini.empspringboot.repository.EmployeeRepositry;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepositry repositry;
	BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();

	@Override
	public EmployeeBean auth(String email, String password) {
		EmployeeBean bean=repositry.findByEmail(email);
		if(bean != null) {
			if(encoder.matches(password, bean.getPassword())) {
				return bean;
			}
			throw new EmployeeException("password not matched");
		}
		throw new EmployeeException("Email doesn't exist");
	}

	@Override
	public boolean register(EmployeeBean bean) {
		bean.setPassword(encoder.encode(bean.getPassword()));
		repositry.save(bean);
		
		List<EmployeeAddressBean> addressBeans= bean.getAddressBeans();
		for (EmployeeAddressBean employeeAddressBean : addressBeans) {
			employeeAddressBean.setBean(bean);
		}
		return true;
	}

	@Override
	public List<EmployeeBean> getAllEmployee(String key) {
		return repositry.findByKey(key);
	}

	@Override
	public boolean changePassword(int id, String password) {
		repositry.changePassword(id, encoder.encode(password));
		return true;
	}

	@Override
	public boolean deleteEmployee(int id) {
		repositry.deleteById(id);
		return false;
	}

}
