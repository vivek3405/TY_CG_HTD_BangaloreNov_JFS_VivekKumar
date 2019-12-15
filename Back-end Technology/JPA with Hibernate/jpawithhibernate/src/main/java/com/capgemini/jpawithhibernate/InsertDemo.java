package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibenate.dto.Movie;

public class InsertDemo 
{
    public static void main( String[] args )
    {
    	Movie movie=new Movie();
    	movie.setMid(106);
    	movie.setMname("ABCD");
    	movie.setRating("good");
    	
    	EntityManager entityManager=null;
    	EntityTransaction transaction=null;
		try {
			EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();
			
			transaction.begin();
			entityManager.persist(movie);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			
		}
    	entityManager.close();
    }
}
