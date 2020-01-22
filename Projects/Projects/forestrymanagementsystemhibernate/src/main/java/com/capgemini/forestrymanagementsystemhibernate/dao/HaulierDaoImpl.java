package com.capgemini.forestrymanagementsystemhibernate.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.forestrymanagementsystemhibernate.dto.HaulierBean;
import com.capgemini.forestrymanagementsystemhibernate.exception.CustomerException;

public class HaulierDaoImpl implements HaulierDao {

	@Override
	public boolean addHaulier(HaulierBean bean) {
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

	@Override
	public boolean searchHaulier(int haulierid) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();

			HaulierBean bean = entityManager.find(HaulierBean.class, haulierid);
			if (bean != null) {
				return true;
			} else {
				throw new CustomerException("Haulier not found");
			}
		} catch (Exception e) {
			e.getMessage();
			transaction.rollback();
		}
		entityManager.close();
		return false;
	}

	@Override
	public boolean deleteHaulier(int haulierid) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();

			HaulierBean bean = entityManager.find(HaulierBean.class, haulierid);
			entityManager.remove(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		entityManager.close();
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<HaulierBean> getAllHauliers() {
		List<HaulierBean> list = new ArrayList<HaulierBean>();
		EntityManager entityManager = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			String jpql = "from HaulierBean";
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
