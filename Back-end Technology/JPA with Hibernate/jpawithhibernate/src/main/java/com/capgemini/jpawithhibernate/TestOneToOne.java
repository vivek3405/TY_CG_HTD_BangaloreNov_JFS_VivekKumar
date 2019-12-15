package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.onetoonedto.Employee;
import com.capgemini.jpawithhibernate.onetoonedto.EmployeeOther;

public class TestOneToOne {
	
	public static void main(String[] args) {
//		Employee emp=new Employee();
//		emp.setEid(123);
//		emp.setEmail("vivek@gmail.com");
//		emp.setName("vivek");
//		emp.setPassword("1234");
//		EmployeeOther other=new EmployeeOther();
//		other.setId(999);
//		other.setMother_name("abc");
//		other.setFather_name("def");
//		other.setPancard("iuiuui");
//		other.setInfo(emp);
//		
		
		EntityManager entityManager=null;
    	EntityTransaction transaction=null;
		try {
			EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();
			
			transaction.begin();
			Employee emp=entityManager.find(Employee.class, 123);
			System.out.println(emp.getOther().getMother_name());
			//entityManager.persist(other);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			
		}
    	entityManager.close();
    }
}
