package br.com.tt;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.tt.model.MaterialDidatico;

public class Sistema {
	public static void main(String[] args) {
		System.out.println("Iniciando o Sistema...");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu_tt");
		EntityManager em = emf.createEntityManager();

		MaterialDidatico materialDidatico = new MaterialDidatico();
		materialDidatico.setCurso("JPA");
		materialDidatico.setVersao(3);
		materialDidatico.setDescricao("Texto com tudo");
		materialDidatico.setProfessor("Paulo Heck");
		materialDidatico.setMateria("JPA, Hibernate");

		em.getTransaction().begin();
		em.persist(materialDidatico);
		em.getTransaction().commit();
		em.close();

		System.exit(0);
	}
}
