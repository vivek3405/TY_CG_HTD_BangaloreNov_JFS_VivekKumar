package com.capgemini.forestrymanagementsystemspringboot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.forestrymanagementsystemspringboot.dto.HaulierBean;
import com.capgemini.forestrymanagementsystemspringboot.exception.CustomerException;

@Repository
public class HaulierDaoImpl implements HaulierDao {
	
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean register(HaulierBean bean) {
		EntityManager manager= factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw new CustomerException("Email already exist/ID already exist");
		}
	}

	@Override
	public List<HaulierBean> getAllCustomer() {
		String jpql="from HaulierBean";
		EntityManager manager=factory.createEntityManager();
		TypedQuery<HaulierBean> query=manager.createQuery(jpql, HaulierBean.class);
		return query.getResultList();
	}

	@Override
	public boolean modifyHaulier(HaulierBean bean) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		HaulierBean haulierBean=manager.find(HaulierBean.class, bean.getHaulid());
		if(haulierBean !=null) {
			haulierBean.setHtelno(bean.getHtelno());
			haulierBean.setHname(bean.getHname());
			haulierBean.setHtown(bean.getHtown());
			haulierBean.setHpostcode(bean.getHpostcode());
			haulierBean.setHemail(bean.getHemail());
			transaction.commit();
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteHaulier(int id) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		HaulierBean bean=manager.find(HaulierBean.class, id);
		if(bean!=null) {
			manager.remove(bean);
			transaction.commit();
			return true;
		}
		throw new CustomerException("Haulier Not Found");
	}

	@Override
	public List<HaulierBean> searchHaulier(int key) {
		String jpql="from HaulierBean where haulid=:haulid or hemail=:hemail";
		EntityManager manager=factory.createEntityManager();
		TypedQuery<HaulierBean> query=manager.createQuery(jpql, HaulierBean.class);
		query.setParameter("haulid", key);
		query.setParameter("hemail", key);
		query.getSingleResult();
		return query.getResultList();
	}

}