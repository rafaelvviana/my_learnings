package br.com.bytebank.banco.modelo;

public class TesteGuardadorReferencias {
	
	public static void main(String[] args) {
		
		GuardadorDeReferencias guardador = new GuardadorDeReferencias();
		
		Conta cc = new ContaCorrente(22,11);		
		guardador.adiciona(cc);
		
		System.out.println(guardador.getQuantidadeElementos());
		
		Conta cc2 = new ContaCorrente(22,22);		
		guardador.adiciona(cc2);
		
		Cliente client1 = new Cliente();
		guardador.adiciona(client1);
		
		System.out.println(guardador.getQuantidadeElementos());
		
		Conta ref = (Conta) guardador.getReferencia(0);
		System.out.println(ref.getNumero());
	}

}
