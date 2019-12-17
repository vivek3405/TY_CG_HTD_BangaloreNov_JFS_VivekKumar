package com.capgemini.mywebapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.mywebapp.beans.EmployeeInfoBean;

public class EmployeeDAOImpl implements EmployeeDAO {
	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");

	@Override
	public EmployeeInfoBean searchEmployee(int empId) {

		EntityManager manager = entityManagerFactory.createEntityManager();
		EmployeeInfoBean employeeInfoBean = manager.find(EmployeeInfoBean.class, empId);

		manager.close();

		return employeeInfoBean;
	}// end of searchEmployee

	@Override
	public EmployeeInfoBean authenticate(int empId, String password) {
		EntityManager manager = entityManagerFactory.createEntityManager();
		String jpql = "from EmployeeInfoBean where empId=:empId and password=:pwd";
		Query query = manager.createQuery(jpql);
		query.setParameter("empId", empId);
		query.setParameter("pwd", password);

		EmployeeInfoBean employeeInfoBean = null;
		try {
			employeeInfoBean = (EmployeeInfoBean) query.getSingleResult(); // throws an Exception if there is no value
		} catch (Exception e) {
			e.printStackTrace();
		}

		manager.close();

		return employeeInfoBean;

	}// end of authentication

	@Override
	public boolean addEmployee() {
		return false;
	}

}// end of class
