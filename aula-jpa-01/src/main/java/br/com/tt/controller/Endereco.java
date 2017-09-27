package br.com.tt.controller;

import static javax.persistence.GenerationType.IDENTITY; // Ctrl + Shift + M Para fazer import estático

import javax.persistence.Entity;
import javax.persistence.GeneratedValue; // Ctrl + Shift + O para organizar os imports
import javax.persistence.Id;

@Entity
public class Endereco {
	@Id
	@GeneratedValue(strategy=IDENTITY) // GenerationType.SEQUENCY para Oracle
	private Long id;
	private String rua;
	private String bairro;
	private String numero;
	private String uf;

	public Endereco() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

}
