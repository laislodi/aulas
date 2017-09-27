package br.com.tt.controller;

import static java.util.Calendar.getInstance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Sistema {
	public static void main(String[] args) {
		String str = "Olá Mundo!";
		System.out.println(str);
		
		Cliente cliente = new Cliente(); // Alt + Shift + L -> lançar variável
		cliente.setNome("Carlos da Silva");
		cliente.setCpf("18293827361");
		cliente.setRg("212234-ES");
		cliente.setDataNascimento(getInstance());
		
		Endereco endereco = new Endereco();
		endereco.setRua("Av. Brasil");
		endereco.setBairro("Bairro");
		endereco.setNumero("21A");
		endereco.setUf("Rio Grande do Sul");
		cliente.setEndereco(endereco);
		
		// A partir daqui, o JPA passa a existir
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu_tt"); //
		
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(endereco);
		em.persist(cliente);
		em.getTransaction().commit();
		System.exit(0); // sair da aplicação
		
	}
}
