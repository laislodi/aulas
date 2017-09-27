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
		Endereco endereco = new Endereco("rua Sao Francisco da California, 23", "Sao Joao", "Poa", Estado.RS);
		cliente.setEndereco(endereco); // esta linha associa o endereco a um cliente
		endereco.setCliente(cliente); // esta linha associa o cliente a um endereco
		em.getTransaction().begin();
		em.persist(cliente);
		em.getTransaction().commit();
		em.clear(); // tira as informações da memoria
		em.close();

		System.exit(0);
	}
}
