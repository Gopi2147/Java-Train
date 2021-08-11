package com.repos;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPARepository {
	private static EntityManagerFactory entityManagerFactory;
	  private static EntityManager em;
	  
	  static {
		 entityManagerFactory=Persistence.createEntityManagerFactory("hellojpa");
		 em=entityManagerFactory.createEntityManager();
	  }
	  
	  public static EntityManager getEntityManager() {
		  return em;
	  }
	}