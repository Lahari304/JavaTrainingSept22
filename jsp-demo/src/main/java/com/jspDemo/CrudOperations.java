package com.jspDemo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CrudOperations {

	public void insertEntity() {
		EntityManagerFactory emFactoryObj = Persistence.createEntityManagerFactory("JSPDemo");
			EntityManager entity = emFactoryObj.createEntityManager();
			entity.getTransaction().begin();
			
			Student emp=new Student("ST111", "Joe");
			entity.persist(emp);
			entity.getTransaction().commit();
			entity.close();
			emFactoryObj.close();
		}
		
		public void updateEntity() {
			EntityManagerFactory emFactoryObj = Persistence.createEntityManagerFactory("JSPDemo");
			EntityManager entity = emFactoryObj.createEntityManager();
			entity.getTransaction().begin();
			
			Student emp = entity.find(Student.class, 1);
			
			emp.setName("Lahari");
			entity.getTransaction().commit();
			entity.close();
			emFactoryObj.close();
		
		}
		
		public void findEntity() {
			EntityManagerFactory emFactoryObj = Persistence.createEntityManagerFactory("JSPDemo");
			EntityManager entity = emFactoryObj.createEntityManager();
			entity.getTransaction().begin();
			
			Student emp = entity.find(Student.class, 1);
			System.out.println("Employee Name: "+emp.getName());
			entity.getTransaction().commit();
			entity.close();
			emFactoryObj.close();
			
		}
		
		public void removeEntity() {
			EntityManagerFactory emFactoryObj = Persistence.createEntityManagerFactory("JSPDemo");
			EntityManager entity = emFactoryObj.createEntityManager();
			entity.getTransaction().begin();
			
			Student emp = entity.find(Student.class, 1);
			
			entity.remove(emp);
			entity.getTransaction().commit();
			entity.close();
			emFactoryObj.close();
			
		}
		
		public List<Student> getAll() {
			EntityManagerFactory emFactoryObj = Persistence.createEntityManagerFactory("JSPDemo");
			EntityManager entity = emFactoryObj.createEntityManager();
			entity.getTransaction().begin();
			
			List<Student> batch = new ArrayList<Student>();
					batch = entity.createQuery("SELECT * FROM STUDENT").getResultList();
			return batch;
		}
	}
