package com.escola.controller.dto;

import java.time.LocalDateTime;

import com.escola.model.Aluno;
import com.escola.model.Gabarito;

public class GabaritoDTO {
	
	private Long id;
	private String respostaGabarito;
	private LocalDateTime dataCriacao;
	private String nomeAluno;
	
	public GabaritoDTO(Gabarito gabarito, Aluno aluno) {
		this.id = gabarito.getId();
		this.respostaGabarito = gabarito.getRespotaGabarito();
		this.dataCriacao = gabarito.getDataCriacao();
		this.nomeAluno = aluno.getNomeAluno();
	}

	public Long getId() {
		return id;
	}

	public String getRespostaGabarito() {
		return respostaGabarito;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	
	
	
}
