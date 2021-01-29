package com.escola.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.escola.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{
	
}
