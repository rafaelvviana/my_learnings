package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteSaca {
	
	public static void main(String[] args) {
		
		Conta cc = new ContaCorrente(123, 1234);
		cc.deposita(100.0);
		try {
			cc.saca(150.0);
		} catch (SaldoInsuficienteException ex) {
			System.out.println(ex.getMessage());
		}		
		
		System.out.println(cc.getSaldo());
	}

}
