package com.atm.hardware;

public class DispensadorDeCelulas {
	
	private final static int CONTADOR_INICIAL = 500;
	private int contador; // número de células de R$ 20 
	
	public DispensadorDeCelulas() {
		this.contador = CONTADOR_INICIAL;
	}
	
	public void dispensaCedulas(Integer quantia) {
		Integer cedulasExigidas = quantia / 20; // quantidade de cedulas de 20 requirido
		contador -= cedulasExigidas;
	}
	
	public boolean dinheiroSuficienteDisponivel(Integer quantia) {
		Integer cedulasExigidas = quantia/20 ; 
		
		if (contador >= cedulasExigidas) {
			return true;
		}else {
			return false;
		}
	}

}
