package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ClienteBanco;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteOrdenacaoListas {

        public static void main(String[] args) {
        	
//                Conta cc1 = new ContaCorrente(22, 33);
//                cc1.deposita(333.0);
//
//                Conta cc2 = new ContaPoupanca(22, 44);
//                cc2.deposita(444.0);
//
//                Conta cc3 = new ContaCorrente(22, 11);
//                cc3.deposita(111.0);
//
//                Conta cc4 = new ContaPoupanca(22, 22);
//                cc4.deposita(222.0);
        	
        	Conta cc1 = new ContaCorrente(22, 33);
            ClienteBanco clienteCC1 = new ClienteBanco();
            clienteCC1.setNome("Nico");
            cc1.setTitular(clienteCC1);
            cc1.deposita(333.0);

            Conta cc2 = new ContaPoupanca(22, 44);
            ClienteBanco clienteCC2 = new ClienteBanco();
            clienteCC2.setNome("Guilherme");
            cc2.setTitular(clienteCC2);
            cc2.deposita(444.0);

            Conta cc3 = new ContaCorrente(22, 11);
            ClienteBanco clienteCC3 = new ClienteBanco();
            clienteCC3.setNome("Paulo");
            cc3.setTitular(clienteCC3);
            cc3.deposita(111.0);

            Conta cc4 = new ContaPoupanca(22, 22);
            ClienteBanco clienteCC4 = new ClienteBanco();
            clienteCC4.setNome("Ana");
            cc4.setTitular(clienteCC4);
            cc4.deposita(222.0);

            List<Conta> lista = new ArrayList<>();
            lista.add(cc1);
            lista.add(cc2);
            lista.add(cc3);
            lista.add(cc4);
            
            for (Conta conta : lista) {
				System.out.println(conta);
			}
            
//            NumeroDaContaComparator comparator = new NumeroDaContaComparator();            
//            lista.sort(comparator);
            lista.sort(new NumeroDaContaComparator());
            
            System.out.println("--------");
            
            for (Conta conta : lista) {
				System.out.println(conta);
			}
            
//            TitularDaContaComparator titularComparator = new TitularDaContaComparator();            
//            lista.sort(titularComparator);
            lista.sort(new TitularDaContaComparator());
            
            System.out.println("--------");
            
            for (Conta conta : lista) {
				System.out.println(conta + " Titular: " + conta.getTitular().getNome());
			}
        }

}

/**
 * 
 * Codigo Antigo
 *
 class NumeroDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {		
		if(c1.getNumero() < c2.getNumero()) {
			return -1;
		} 
		if(c1.getNumero() > c1.getNumero()) {
			return 1;			
		}		
		return 0;		
	}	
}
*/

/**
 * 
 * Codigo melhorado abaixo
 *
 */
class NumeroDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {		
		/**
		 * c1 > c2 --> retorno positivo
		 * c1 < c2 --> retorno negativo
		 * c1 = c2 --> retorno 0
		 * return c1.getNumero() - c2.getNumero();
		 */
		
		// outra forma, mais elegante: 		
		return Integer.compare(c1.getNumero(), c2.getNumero());
	}
}


class TitularDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {
		
		String nomeC1 = c1.getTitular().getNome();
		String nomeC2 = c2.getTitular().getNome();
		
		return nomeC1.compareTo(nomeC2);
	}
	
}