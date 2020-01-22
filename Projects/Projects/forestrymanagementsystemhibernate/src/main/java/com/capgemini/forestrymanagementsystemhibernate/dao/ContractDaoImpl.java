package com.capgemini.forestrymanagementsystemhibernate.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.forestrymanagementsystemhibernate.dto.ContractBean;

public class ContractDaoImpl implements ContractDao {

	@Override
	public boolean addContract(ContractBean bean) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();

			transaction.begin();
			entityManager.persist(bean);
			transaction.commit();
			entityManager.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();

		}
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ContractBean> getAllContracts() {
		List<ContractBean> list = new ArrayList<ContractBean>();
		EntityManager entityManager = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			String jpql = "from ContractBean";
			Query query = entityManager.createQuery(jpql);

			list = query.getResultList();
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		entityManager.close();
		return null;
	}

}