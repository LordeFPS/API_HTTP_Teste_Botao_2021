package com.escola.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.escola.model.Aluno;
import com.escola.repositories.AlunoRepository;

@RestController
@RequestMapping("/aluno")
public class AlunoResource {
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	@GetMapping
	@ResponseBody
	public List<Aluno> listarTodoAluno() {	
		
		return alunoRepository.findAll();
	}
	
	@RequestMapping
	public void inserirAluno(@RequestBody Aluno aluno) {
		alunoRepository.save(aluno);
	}
}
