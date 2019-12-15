package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibenate.dto.Movie;

public class UpdateDemo {

	public static void main(String[] args) {
		EntityTransaction transaction=null;
		EntityManager entityManager=null;
		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();
			transaction.begin();
			Movie record=entityManager.find(Movie.class, 2019001);
			record.setMname("dil toh pagal hai");
			System.out.println("record updated");
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		entityManager.close();
	}

}
