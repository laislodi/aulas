package br.com.tt.model;

public enum Sexo {
	M("Masculino"), F("Feminino"), A("Outro");

	private String descricao;

	private Sexo(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}
