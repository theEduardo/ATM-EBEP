package com.atm.hardware;

import com.atm.software.ContaCorrente;

public class CartaoEletronico {
	
	private String numeroDoCartao;
	private ContaCorrente conta;
	
	public CartaoEletronico(String numeroDoCartao, ContaCorrente conta) {
		this.numeroDoCartao = numeroDoCartao;
		this.conta = conta;
	}
	
	public CartaoEletronico() {
		// TODO Auto-generated constructor stub
	}
	
	public String getNumeroDoCartao() {
		return numeroDoCartao;
	}
	public void setNumeroDoCartao(String numeroDoCartao) {
		this.numeroDoCartao = numeroDoCartao;
	}
	public ContaCorrente getConta() {
		return conta;
	}
	public void setConta(ContaCorrente conta) {
		this.conta = conta;
	}
	
	

}
