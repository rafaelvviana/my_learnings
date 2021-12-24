package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteClassesWrappers {

	public static void main(String[] args) {
		
		// Autoboxing
		// Wrapper
		
		/**
		 *  int --> java.lang.Integer (classe wrapper)
		 *  
		 *  	--> Autoboxing
		 *  	<-- Unboxing
		 *  
		 *  
		 *  double 	Double		>>
		 *  float	Float		>>>>
		 *  long	Long		>>>>>	Todas heram de java.lang.Number
		 *  int		Integer		>>>>>
		 *  short	Short		>>>
		 *  byte	Byte		>>
		 *  
		 *  char	Character
		 *  boolean	Boolean
		 *  
		 */
		
		int[] idades = new int[5];
		String[] nomes = new String[65];
		
		int idade = 29;
		
		// Integer idadeRef = new Integer(29);
		
		Integer idadeRef = Integer.valueOf(29);
		int valor = idadeRef.intValue();
		
		String s = args[0];
		
		Integer numeroInteiro = Integer.valueOf(s);
		int numeroInteiro2 = Integer.parseInt(s);
		
		System.out.println(numeroInteiro);
		System.out.println(numeroInteiro2);
		
		System.out.println(idadeRef.doubleValue());
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(29);
		// numeros.add(Integer.valueOf(29));
		
		
		
	}
	
}
