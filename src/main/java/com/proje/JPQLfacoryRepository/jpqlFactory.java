package com.proje.JPQLfacoryRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public interface jpqlFactory {
	
	EntityManager getEntityManager();
	
	EntityTransaction getEntityTransaction();

}
