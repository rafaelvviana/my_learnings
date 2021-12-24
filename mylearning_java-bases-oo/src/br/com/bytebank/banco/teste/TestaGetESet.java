package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ClienteBanco;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TestaGetESet {
	
	public static void main(String[] args) {
		
		
		ContaCorrente conta = new ContaCorrente(1337, 24226);		
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		ClienteBanco paulo = new ClienteBanco();
		paulo.setNome("Paulo");
		paulo.setCpf("123456789");
		paulo.setProfissao("Dev");
		
		conta.setTitular(paulo);
		System.out.println(conta.getTitular().getNome());
	}

}
