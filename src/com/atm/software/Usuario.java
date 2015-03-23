package com.atm.software;

public class Usuario {
	
	private String nome;
	private String cpf;
	
	public Usuario(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public Usuario(){
		
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}
	
	
	

}
