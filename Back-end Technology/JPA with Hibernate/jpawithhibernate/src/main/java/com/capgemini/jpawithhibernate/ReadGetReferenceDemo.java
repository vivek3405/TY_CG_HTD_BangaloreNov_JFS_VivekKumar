package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibenate.dto.Movie;

public class ReadGetReferenceDemo {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Movie record=entityManager.getReference(Movie.class, 2019001);
		//Movie record=entityManager.find(Movie.class, 2019001);
		System.out.println(record.getClass());
//		
//		System.out.println("Id-----> "+ record.getMid());
//		System.out.println("Name----> "+ record.getMname());
//		System.out.println("rating-----> "+ record.getRating());
		
		entityManager.close();
	}
}
