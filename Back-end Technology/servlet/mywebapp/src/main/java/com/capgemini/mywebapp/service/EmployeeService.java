package com.capgemini.mywebapp.service;

import com.capgemini.mywebapp.beans.EmployeeInfoBean;

public interface EmployeeService {
	public EmployeeInfoBean searchEmployee(int empId);

	public EmployeeInfoBean authenticate(int empId, String password);

}// end of DAO
