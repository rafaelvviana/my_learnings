package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Gerente;

public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Gerente funcionario = new Gerente();
		funcionario.setNome("Rafael");
		funcionario.setCpf("123456789");
		funcionario.setSalario(15000.0);
		
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getBonificacao());
		
	}

}
