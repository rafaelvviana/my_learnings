package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayDePrimitivos { 
	
	public static void main(String[] args) {
		
//		Conta[] contas = new Conta[5];
		Object[] referencias = new Object[5];
		
		ContaCorrente cc1 = new ContaCorrente(11, 11);		
		referencias[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(22, 22);		
		referencias[1] = cc2;
		
//		Cliente cliente = new Cliente();
		
//		ContaPoupanca ref = (ContaPoupanca) referencias[1];
//		ContaCorrente ref2 = (ContaCorrente) contas[1];
		
//		System.out.println((Conta)referencias[1].getNumero());
	}

}
