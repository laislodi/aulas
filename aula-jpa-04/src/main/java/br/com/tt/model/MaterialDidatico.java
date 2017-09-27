package br.com.tt.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MaterialDidatico {
	
	@Id
	private MaterialDidaticoPKClass id;
	
	private String descricao;
	private String materia;
	private String professor;
	
	public MaterialDidaticoPKClass getId() {
		return id;
	}
	public void setId(MaterialDidaticoPKClass id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	
	
}
