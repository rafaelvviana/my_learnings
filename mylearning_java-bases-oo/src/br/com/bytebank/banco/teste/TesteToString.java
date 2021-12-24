package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteToString {
	
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(123, 123);
		
		System.out.println(cc);
	}

}
