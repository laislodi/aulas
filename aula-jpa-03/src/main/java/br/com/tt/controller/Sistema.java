package br.com.tt.controller;

import static br.com.tt.model.Sexo.F;
import static br.com.tt.util.Jpa.em;
import static java.util.Calendar.getInstance;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.tt.model.Pessoa;
import br.com.tt.model.Sexo;

public class Sistema {

	public static void main(String[] args) {
		System.out.println("Iniciando o Sistema...");

		EntityManager em = em();
		em.getTransaction().begin();
		em.persist(new Pessoa("Lais"));
		em.persist(new Pessoa("Lais", "12345678901"));
		Pessoa pessoa = new Pessoa("Lais", "12345678902", "123456-ES");
		pessoa.setSexo(F);
		pessoa.setDataNascimento(getInstance());
		em.persist(pessoa);
		em.getTransaction().commit();

		System.out.println(Sexo.F.getDescricao());

		String sql = "SELECT P FROM Pessoa P";

		TypedQuery<Pessoa> query = em.createQuery(sql, Pessoa.class);
		List<Pessoa> pessoasList = query.getResultList();
		pessoasList.forEach(System.out::println);
		em.close();

		System.exit(0);
	}

}
