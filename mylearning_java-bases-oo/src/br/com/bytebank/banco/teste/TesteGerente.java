package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Administrador;
import br.com.bytebank.banco.modelo.Autenticavel;
import br.com.bytebank.banco.modelo.Gerente;

public class TesteGerente {
	
	public static void main(String[] args) {
		
		Autenticavel referencia = new Administrador();		
		referencia.autentica(2222);
		
		Gerente gerente = new Gerente();
		gerente.setNome("Rafael");
		gerente.setCpf("123456789");
		gerente.setSalario(15000.0);
		
		System.out.println(gerente.getNome());
		System.out.println(gerente.getBonificacao());
		
	}

}
