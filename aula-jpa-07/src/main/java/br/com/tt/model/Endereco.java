package br.com.tt.model;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Endereco {
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Long id;
	private String rua;
	private /* Bairro */String bairro;
	private /* Cidade */String cidade;
	@Enumerated(EnumType.STRING) // escreve a descri��o do ENUM
	private Estado estado;
	@OneToOne(mappedBy = "endereco", cascade = ALL) // nome do atributo Endereco dentro da classe Cliente
	private Cliente cliente;

	public Endereco() {
		super();
	}

	public Endereco(String rua, String bairro, String cidade, Estado estado) {
		super();
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
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

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
