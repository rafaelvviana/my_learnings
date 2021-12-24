package br.com.bytebank.banco.teste.util;

import java.util.LinkedList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteLinkedList {
	
	public static void main(String[] args) {
		
		/**
		 * Collection
		 * 		List
		 * 			ArrayList
		 * 			LinkedList
		 * 			Vector
		 * 		Set
		 * 			HashSet
		 */
		
		
		// Generics --> Tipar a lista
		
		// List
//		List<Conta> lista = new ArrayList<Conta>();
		
		// Vector --- threadsafe Para uso em diferentes Threads		
//		List<Conta> lista = new Vector<Conta>();
		
		// LinkedList
		LinkedList<Conta> lista = new LinkedList<Conta>();
		
				
		
		Conta cc = new ContaCorrente(22,11);		
		lista.add(cc);
				
		Conta cc2 = new ContaCorrente(22,22);		
		lista.add(cc2);
				
		System.out.println(lista.size());
		
		Conta ref = lista.get(0);
		
		System.out.println(ref.getNumero());
		
		for(int i=0;i<lista.size();i++) {
			Object oref = lista.get(i);
			System.out.println(oref);
		}
		
		System.out.println("*****");
		
		for(Conta oref: lista) {
			System.out.println(oref);
		}
		
	}

}
