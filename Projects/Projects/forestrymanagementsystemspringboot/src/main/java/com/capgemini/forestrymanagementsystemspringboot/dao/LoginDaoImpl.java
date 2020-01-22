package com.capgemini.forestrymanagementsystemspringboot.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

import com.capgemini.forestrymanagementsystemspringboot.dto.LoginBean;
import com.capgemini.forestrymanagementsystemspringboot.exception.LoginException;

@Repository
public class LoginDaoImpl implements LoginDao {
	
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public LoginBean auth(String email, String password) {
		EntityManager manager=factory.createEntityManager();
		String jpql="from LoginBean where email=:email";
		TypedQuery<LoginBean> query=manager.createQuery(jpql, LoginBean.class);
		query.setParameter("email", email);
		//query.setParameter("password", password);
		try {
			LoginBean bean=query.getSingleResult();
			BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
			if(encoder.matches(password, bean.getPassword())){
				return bean;
			}else {
				throw new LoginException("Password Invalid");
			}
		} catch (Exception e) {
			throw new LoginException("Email Invalid");
		}
	}

	@Override
	public boolean register(LoginBean bean) {
		EntityManager manager= factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw new LoginException("Email already exist");
		}
	}

}
