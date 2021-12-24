package br.com.bytebank.banco.modelo;

import java.io.Serializable;

public class ContaCorrente extends Conta implements Tributavel {

	
	public ContaCorrente(int agencia, int numero) {		
		super(agencia, numero);		
	}

	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}

	@Override
	public double getValorImposto() {
		
		return super.getSaldo() * 0.01;
	}	
	
	@Override
	public String toString() {
		
		return "Conta Corrente. " + super.toString();
	}
	
}
