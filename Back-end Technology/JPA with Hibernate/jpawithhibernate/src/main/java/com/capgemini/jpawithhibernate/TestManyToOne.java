package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.manytoone.EmployeeExperience;
import com.capgemini.jpawithhibernate.onetoonedto.Employee;

public class TestManyToOne {

	public static void main(String[] args) {

		Employee em = new Employee();
		em.setEid(13);
		em.setEmail("vivek@gmail.com");
		em.setName("vivek");
		em.setPassword("12346");

		EmployeeExperience exp=new EmployeeExperience();
		exp.setCname("capgemini");
		exp.setExpid(9);
		exp.setNoOfYear(2);
		exp.setEmp(em);

		EmployeeExperience exp1=new EmployeeExperience();
		exp1.setCname("tyss");
		exp1.setExpid(8);
		exp1.setNoOfYear(2);
		exp1.setEmp(em);

		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		try {
			EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();

			transaction.begin();
			entityManager.persist(exp);
			entityManager.persist(exp1);
			transaction.commit();
			System.out.println("record updated");
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();

		}
		entityManager.close();
	}

}

