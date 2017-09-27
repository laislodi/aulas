package br.com.tt.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Jpa {

	public static EntityManager em() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu_tt");
		EntityManager em = emf.createEntityManager();
		
		return em;
	}
	
}
