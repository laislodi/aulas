package br.com.tt.controller;

import static javax.persistence.TemporalType.DATE;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "CLIENTE_TB")
public class Cliente implements Serializable { // Ctrl + Shift + P para ir para o início e para o fim da classe

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue // MySQL
	private Long id;
	private String nome;
	@Column(name = "DOC_CPF", unique = true, length = 11, nullable = false)
	private String cpf;
	private String rg;
	@Temporal(DATE)
	@Column(name="DATA_NASCIMENTO") // Ctrl + Shift + X - Maiúsculo / Ctrl + Shift + Y - Minúsculo
	private Calendar dataNascimento;
	@OneToOne
	private Endereco endereco;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
