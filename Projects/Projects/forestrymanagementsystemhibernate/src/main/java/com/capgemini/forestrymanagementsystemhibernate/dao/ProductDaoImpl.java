package com.capgemini.forestrymanagementsystemhibernate.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.forestrymanagementsystemhibernate.dto.ProductBean;
import com.capgemini.forestrymanagementsystemhibernate.exception.ProductException;

public class ProductDaoImpl implements ProductDao {

	@Override
	public boolean addProduct(ProductBean bean) {
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
	public List<ProductBean> searchProduct(int productid) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql = "from ProductBean where prodid=:prodid";

		Query query = entityManager.createQuery(jpql);
		query.setParameter("prodid", productid);
		List<ProductBean> list = query.getResultList();
		return list;
	}

	@Override
	public boolean deleteProduct(int productid) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();

			ProductBean bean = entityManager.find(ProductBean.class, productid);
			if (bean == null) {
				throw new ProductException("product not found");
			}
			entityManager.remove(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.getMessage();
			transaction.rollback();
		}
		entityManager.close();
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ProductBean> getAllProduct() {
		List<ProductBean> list = new ArrayList<ProductBean>();
		EntityManager entityManager = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			String jpql = "from ProductBean";
			Query query = entityManager.createQuery(jpql);

			list = query.getResultList();

			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		entityManager.close();
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ProductBean> searchProduct(String pname) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql = "from ProductBean where pname=:pname";
		List<ProductBean> list = null;
		try {
			Query query = entityManager.createQuery(jpql);
			query.setParameter("pname", pname);
			list = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
