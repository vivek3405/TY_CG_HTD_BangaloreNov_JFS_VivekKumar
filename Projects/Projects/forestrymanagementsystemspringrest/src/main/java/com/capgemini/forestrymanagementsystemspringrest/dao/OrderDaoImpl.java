package com.capgemini.forestrymanagementsystemspringrest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.forestrymanagementsystemspringrest.dto.OrdersBean;
import com.capgemini.forestrymanagementsystemspringrest.exception.OrderException;

@Repository
public class OrderDaoImpl implements OrderDao {
	
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean addOrder(OrdersBean bean) {
		EntityManager manager= factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw new OrderException("Order already exists");
		}
	}

	@Override
	public List<OrdersBean> getAllOrder() {
		String jpql="from OrdersBean";
		EntityManager manager=factory.createEntityManager();
		TypedQuery<OrdersBean> query=manager.createQuery(jpql, OrdersBean.class);
		return query.getResultList();
	}

	@Override
	public boolean modifyOrder(OrdersBean bean) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		OrdersBean orderBean=manager.find(OrdersBean.class, bean.getOrderId());
		if(orderBean !=null) {
			orderBean.setPname(bean.getPname());
			orderBean.setQuantity(bean.getQuantity());
			transaction.commit();
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteOrder(int id) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		OrdersBean bean=manager.find(OrdersBean.class, id);
		if(bean!=null) {
			manager.remove(bean);
			transaction.commit();
			return true;
		}
		throw new OrderException("Order Not Found");
	}

}
