package br.com.tt;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.tt.model.MaterialDidatico;
import br.com.tt.model.MaterialDidaticoPKClass;

public class Sistema {
	public static void main(String[] args) {
		System.out.println("Iniciando o Sistema...");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu_tt");
		EntityManager em = emf.createEntityManager();
		
		MaterialDidatico materialDidatico = new MaterialDidatico();
		MaterialDidaticoPKClass id = new MaterialDidaticoPKClass();
		id.setCurso("JPA");
		id.setVersao(3);
		materialDidatico.setId(id);
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
