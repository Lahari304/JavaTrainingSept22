package com.jpaDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaRelation {
	
	private static final EntityManagerFactory emfactoryObj;
	static {
		
		emfactoryObj = Persistence.createEntityManagerFactory("JPADemo");
		}
	
	public static EntityManager getEntityManager() {
		return emfactoryObj.createEntityManager();	
	}
	
	public static void main(String [] args) {
		EntityManager entity = getEntityManager();
		
		entity.getTransaction().begin();
		Student stud = new Student("Lahari", "India");
		
		entity.persist(stud);
		entity.getTransaction().commit();
		entity.close();
		emfactoryObj.close();
		
		
	}
}
