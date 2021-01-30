package com.escola.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Gabarito {
	// essas configuracoes com @ são do  JPA
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) //o proprio DB gera um ID
	private Long id;
	private String respostaGabarito;
	
	@ManyToOne
	private Prova nomeProva;
	private LocalDateTime dataCriacao = LocalDateTime.now();
	@ManyToOne
	private Aluno nomeAluno;
	private Boolean solucao = false;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((solucao == null) ? 0 : solucao.hashCode());
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
		Gabarito other = (Gabarito) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (solucao == null) {
			if (other.solucao != null)
				return false;
		} else if (!solucao.equals(other.solucao))
			return false;
		return true;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRespotaGabarito() {
		return respostaGabarito;
	}
	public void setRespotaGabarito(String respotaGabarito) {
		this.respostaGabarito = respotaGabarito;
	}
	public Prova getNomeProva() {
		return nomeProva;
	}
	public void setNomeProva(Prova nomeProva) {
		this.nomeProva = nomeProva;
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
	public Boolean getSolucao() {
		return solucao;
	}
	public void setSolucao(Boolean solucao) {
		this.solucao = solucao;
	}
		
		
}
