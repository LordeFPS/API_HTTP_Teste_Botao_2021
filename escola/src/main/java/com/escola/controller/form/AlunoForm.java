package com.escola.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class AlunoForm {
	
	@NotNull @NotEmpty 
	private String nomeProva;
	
	@NotNull @NotEmpty
	private String resposta;
	
	
	
	

	

}
