package com.capgemini.mywebapp.service;

import com.capgemini.mywebapp.beans.EmployeeInfoBean;
import com.capgemini.mywebapp.dao.EmployeeDAO;
import com.capgemini.mywebapp.dao.EmployeeDAOImpl;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO dao = new EmployeeDAOImpl();

	@Override
	public EmployeeInfoBean searchEmployee(int empId) {
		return dao.searchEmployee(empId);

	}// end of searchEmployee()

	@Override
	public EmployeeInfoBean authenticate(int empId, String password) {
		return dao.authenticate(empId, password);
	}

}// end of class
