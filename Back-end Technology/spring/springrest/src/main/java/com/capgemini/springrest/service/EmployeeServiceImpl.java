package com.capgemini.springrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.capgemini.springrest.dao.EmployeeDAO;
import com.capgemini.springrest.dto.EmployeeAddressBean;
import com.capgemini.springrest.dto.EmployeeBean;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO dao;

	@Override
	public EmployeeBean auth(String email, String password) {
		return dao.auth(email, password);
	}

	@Override
	public boolean register(EmployeeBean bean) {
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		String encodedPassword = encoder.encode(bean.getPassword());
		bean.setPassword(encodedPassword);
		
		List<EmployeeAddressBean> addressBeans= bean.getAddressBeans();
		for (EmployeeAddressBean employeeAddressBean : addressBeans) {
			employeeAddressBean.setBean(bean);
			
		}
		return dao.register(bean);
	}

	@Override
	public List<EmployeeBean> getAllEmployee(String key) {
		return dao.getAllEmployee(key);
	}

	@Override
	public boolean changePassword(int id, String password) {
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		return dao.changePassword(id, encoder.encode(password));
	}

	@Override
	public boolean deleteEmployee(int id) {
		return dao.deleteEmployee(id);
	}

}
