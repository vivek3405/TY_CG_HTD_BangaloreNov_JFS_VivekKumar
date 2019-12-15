package com.capgemini.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Update {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		String jpql="Update Movie set mname=:name where mid=:id";
		
//		String jpql="Update Movie set mname='abcd2' where mid=102";
		Query query=entityManager.createQuery(jpql);
		query.setParameter("id", 102);
		query.setParameter("name", "abcd3");
		query.executeUpdate();
		transaction.commit();
	}

}
