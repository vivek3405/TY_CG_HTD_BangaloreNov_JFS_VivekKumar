package com.capgemini.jpawithhibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.jpawithhibenate.dto.Movie;

public class Jpql {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		//String jpql="from Movie";
		String jpql="Select mname from Movie";
		Query query=entityManager.createQuery(jpql);
		
		List<String> record =query.getResultList();
		
		
		for (String movie : record) {
			System.out.println(movie);
			System.out.println("===================");
			
		}
		
	}

}
