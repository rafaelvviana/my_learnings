package br.com.bytebank.banco.modelo;

public class TesteGuardadorContas {
	
	public static void main(String[] args) {
		
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta cc = new ContaCorrente(22,11);		
		guardador.adiciona(cc);
		
		System.out.println(guardador.getQuantidadeElementos());
		
		Conta cc2 = new ContaCorrente(22,22);		
		guardador.adiciona(cc2);
		
		System.out.println(guardador.getQuantidadeElementos());
		
		Conta ref = guardador.getReferencia(0);
		System.out.println(ref.getNumero());
	}

}
