package com.capgemini.mywebapp.dao;

import com.capgemini.mywebapp.beans.EmployeeInfoBean;

public interface EmployeeDAO {
	public EmployeeInfoBean authenticate(int empId, String password);

	public EmployeeInfoBean searchEmployee(int empId);
	
	public  boolean addEmployee();
}// end of DAO
