package com.capgemini.forestrymanagementsystemspringboot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

import com.capgemini.forestrymanagementsystemspringboot.dto.CustomerBean;
import com.capgemini.forestrymanagementsystemspringboot.exception.CustomerException;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public CustomerBean auth(String email, String password) {
		EntityManager manager=factory.createEntityManager();
		String jpql="from CustomerBean where email=:email";
		TypedQuery<CustomerBean> query=manager.createQuery(jpql, CustomerBean.class);
		query.setParameter("email", email);
		//query.setParameter("password", password);
		try {
			CustomerBean bean=query.getSingleResult();
			BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
			if(encoder.matches(password, bean.getPassword())){
				return bean;
			}else {
				throw new CustomerException("Password Invalid");
			}
		} catch (Exception e) {
			throw new CustomerException("Email Invalid");
		}
	}
	@Override
	public boolean register(CustomerBean bean) {
		EntityManager manager= factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw new CustomerException("Email already exist");
		}
	}

	@Override
	public List<CustomerBean> getAllCustomer() {
		String jpql="from CustomerBean";
		EntityManager manager=factory.createEntityManager();
		TypedQuery<CustomerBean> query=manager.createQuery(jpql, CustomerBean.class);
		return query.getResultList();
	}

	@Override
	public boolean changePassword(int id, String password) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		CustomerBean bean=manager.find(CustomerBean.class, id);
		bean.setPassword(password);
		transaction.commit();
		return true;
	}

	@Override
	public boolean deleteCustomer(int id) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		CustomerBean bean=manager.find(CustomerBean.class, id);
		if(bean!=null) {
			manager.remove(bean);
			transaction.commit();
			return true;
		}
		throw new CustomerException("Customer Not Found");
	}
	@Override
	public List<CustomerBean> searchCustomer(int key) {
		String jpql="from CustomerBean where custid=:custid";
		EntityManager manager=factory.createEntityManager();
		TypedQuery<CustomerBean> query=manager.createQuery(jpql, CustomerBean.class);
		query.setParameter("custid", key);
		query.getSingleResult();
		return query.getResultList();
	}


}
