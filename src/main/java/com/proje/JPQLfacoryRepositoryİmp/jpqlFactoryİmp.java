package com.proje.JPQLfacoryRepository›mp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.proje.JPQLfacoryRepository.jpqlFactory;

public class jpqlFactory›mp implements jpqlFactory{
	
	private EntityManager entityManager=null;
	@Override
	public EntityManager getEntityManager() {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("persistence-unit");
		entityManager=factory.createEntityManager();
		return entityManager;
	}

	@Override
	public EntityTransaction getEntityTransaction() {
		EntityTransaction transaction=this.entityManager.getTransaction();
		return transaction;
	}

}
