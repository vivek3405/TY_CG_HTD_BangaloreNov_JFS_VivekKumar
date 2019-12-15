package com.capgemini.jpawithhibernate;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.manytomany.TrainingInfo;
import com.capgemini.jpawithhibernate.onetoonedto.Employee;

public class TestManyToMany {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setEid(8888);
		emp.setEmail("am@gmail.com");
		emp.setName("aman");
		emp.setPassword("9876");

		Employee emp1=new Employee();
		emp1.setEid(8889);
		emp1.setEmail("n@gmail.com");
		emp1.setName("Nikhila");
		emp1.setPassword("dkhs");

		ArrayList<Employee> aList=new ArrayList<Employee>();

		aList.add(emp);
		aList.add(emp1);

		TrainingInfo tInfo=new TrainingInfo();
		tInfo.setTid(5555);
		tInfo.setTname("java fs");
		tInfo.setEList(aList);

		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		try {
			EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();

			transaction.begin();
			entityManager.persist(tInfo);
			transaction.commit();
			System.out.println("record updated");
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();

		}
		entityManager.close();
	}
}

