package com.escola.config.validacao;

public class ErroDeRespostaDTO {
	
	private String campo;
	private String erro;
	
	public ErroDeRespostaDTO(String campo, String erro) {
		this.campo = campo;
		this.erro = erro;
	}
	
	public String getCampo() {
		return campo;
	}
	public String getErro() {
		return erro;
	}
	
	
}
