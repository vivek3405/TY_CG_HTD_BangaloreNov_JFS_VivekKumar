package com.capgemini.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Delete {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		String jpql="delete from Movie where mid=:id";
		//String jpql="delete from Movie where mid=104";
		Query query=entityManager.createQuery(jpql);
		query.setParameter("id", 102);
		
		query.executeUpdate();
		transaction.commit();
	}

}
