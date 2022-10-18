package com.jpaDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaRelations {
	
//	private static final EntityManagerFactory emFactoryObj;
//	
//	static {
//		emFactoryObj = Persistence.createEntityManagerFactory("JPADemo");
//	}
//	
//	public static EntityManager getEntityManager() {
//		return emFactoryObj.createEntityManager();
//	}
	
	public static void main(String[] args) {
		
//		EntityManagerFactory emFactoryObj = Persistence.createEntityManagerFactory("JPADemo");
//		EntityManager entity = emFactoryObj.createEntityManager();
//		entity.getTransaction().begin();
//		
//		
//		Employee emp = new Employee("John", 1000);
//		entity.merge(emp);
//		
////		entity.persist(emp);
//		entity.getTransaction().commit();
//		
//		entity.close();
//		emFactoryObj.close();
		
		CrudOperations op = new CrudOperations();
		//op.insertEntity();
		//op.updateEntity();
		//op.findEntity();
		op.removeEntity();
	}

}
