package com.jpaDemo;

//FOR REFERENCE

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CrudOperations {
	
	public void insertEntity() {
		EntityManagerFactory emFactoryObj = Persistence.createEntityManagerFactory("JPADemo");
		EntityManager entity = emFactoryObj.createEntityManager();
		entity.getTransaction().begin();
		
		Student emp=new Student();
		entity.persist(emp);
		entity.getTransaction().commit();
		entity.close();
		emFactoryObj.close();
	}
	
	public void updateEntity() {
		EntityManagerFactory emFactoryObj = Persistence.createEntityManagerFactory("JPADemo");
		EntityManager entity = emFactoryObj.createEntityManager();
		entity.getTransaction().begin();
		
		Student emp = entity.find(Student.class, 1);
		
		emp.setAddress("India");
		entity.getTransaction().commit();
		entity.close();
		emFactoryObj.close();
	
	}
	
	public void findEntity() {
		EntityManagerFactory emFactoryObj = Persistence.createEntityManagerFactory("JPADemo");
		EntityManager entity = emFactoryObj.createEntityManager();
		entity.getTransaction().begin();
		Student emp = entity.find(Student.class, 1);
		System.out.println("Employee Name: "+emp.getName());
		entity.getTransaction().commit();
		entity.close();
		emFactoryObj.close();
		
	}
	
	public void removeEntity() {
		EntityManagerFactory emFactoryObj = Persistence.createEntityManagerFactory("JPADemo");
		EntityManager entity = emFactoryObj.createEntityManager();
		entity.getTransaction().begin();
		
		Student emp = entity.find(Student.class, 1);
		
		entity.remove(emp);
		entity.getTransaction().commit();
		entity.close();
		emFactoryObj.close();
		
	}

}