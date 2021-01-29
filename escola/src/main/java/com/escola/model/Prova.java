package com.escola.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



@Entity
public class Prova {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) //o proprio DB gera um ID
	private Long id;
	private String provaNome;
	private String provaGabarito;
	private LocalDateTime dataCriacao = LocalDateTime.now();
	@ManyToOne
	private Aluno nomeAluno;
	@OneToMany(mappedBy = "topico") // uma prova pode ter varias respostas
	private List<Gabarito> respostas = new ArrayList<>();
	
	public Prova() {

	}

	public Prova(String provaNome, String provaGabarito, Aluno nomeAluno) {
		super();
		this.provaNome = provaNome;
		this.provaGabarito = provaGabarito;
		this.nomeAluno = nomeAluno;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prova other = (Prova) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProvaNome() {
		return provaNome;
	}

	public void setProvaNome(String provaNome) {
		this.provaNome = provaNome;
	}

	public String getProvaGabarito() {
		return provaGabarito;
	}

	public void setProvaGabarito(String provaGabarito) {
		this.provaGabarito = provaGabarito;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Aluno getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(Aluno nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public List<Gabarito> getRespostas() {
		return respostas;
	}

	public void setRespostas(List<Gabarito> respostas) {
		this.respostas = respostas;
	}
	
	
}
