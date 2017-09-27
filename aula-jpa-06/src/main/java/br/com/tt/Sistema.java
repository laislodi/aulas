package br.com.tt;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.tt.model.Cliente;
import br.com.tt.model.Endereco;
import br.com.tt.model.Estado;

public class Sistema {
	public static void main(String[] args) {
		System.out.println("Iniciando..");

		EntityManager em = Persistence.createEntityManagerFactory("pu_tt").createEntityManager();
		Cliente cliente = new Cliente();
		cliente.setNome("Ricardo Mauro");
		cliente.setEndereco(new Endereco("rua 1", "Sao Joao", "Poa", Estado.RS));
		em.getTransaction().begin();
		em.persist(cliente);
		em.getTransaction().commit();
		em.clear(); // tira as informações da memoria
		em.close();

		System.exit(0);
	}
}
