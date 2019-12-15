package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibenate.dto.Movie;

public class Reattaching {
	public static void main(String[] args) {
		EntityTransaction transaction=null;
		EntityManager entityManager=null;
		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();
			transaction.begin();
			Movie record=entityManager.find(Movie.class, 2019001);
			System.out.println(entityManager.contains(record));//checks if the object is present in the database or not
			entityManager.detach(record); /////it will seperate the object from the database and no further operation will be executed.
			Movie reattachMovie=entityManager.merge(record);//to reattach the object
			reattachMovie.setMname("dil toh bacha hai");
			System.out.println(entityManager.contains(record));
			System.out.println("record updated");
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		entityManager.close();
	}
}
