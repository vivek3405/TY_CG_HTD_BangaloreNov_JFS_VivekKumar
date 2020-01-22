package com.capgemini.forestrymanagementsystemspringrest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.forestrymanagementsystemspringrest.dto.ContractBean;
import com.capgemini.forestrymanagementsystemspringrest.exception.CustomerException;

@Repository
public class ContractDaoImpl implements ContractDao {

	@PersistenceUnit
	private EntityManagerFactory factory;
	
	@Override
	public boolean addContract(ContractBean bean) {
		EntityManager manager= factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw new CustomerException("contract already exist");
		}
	}

	@Override
	public List<ContractBean> getAllContract() {
		String jpql="from ContractBean";
		EntityManager manager=factory.createEntityManager();
		TypedQuery<ContractBean> query=manager.createQuery(jpql, ContractBean.class);
		return query.getResultList();
	}

}
