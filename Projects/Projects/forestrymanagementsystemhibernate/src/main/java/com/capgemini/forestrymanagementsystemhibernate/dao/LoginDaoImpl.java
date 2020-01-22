package com.capgemini.forestrymanagementsystemhibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.forestrymanagementsystemhibernate.dto.LoginBean;
import com.capgemini.forestrymanagementsystemhibernate.exception.LoginException;

public class LoginDaoImpl implements LoginDao {

	EntityManager entityManager = null;
	EntityTransaction transaction = null;

	@Override
	public String loginAdmin(String id, String password) {
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			LoginBean bean = entityManager.find(LoginBean.class, id);
			if (bean == null) {
				throw new LoginException("Please try again");
			}
			String pass = bean.getPassword();
			transaction.commit();
			if (pass.equals(password)) {
				return pass;
			}
		} catch (Exception e) {
			e.getMessage();
			transaction.rollback();
		}
		return null;

	}
}