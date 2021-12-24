package br.com.rvv.java.collections;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {
	
	public static void main(String[] args) {
		
		/**
		 *  HashSet
		 *  n�o aceita objetos repetidos
		 *  n�o tem get, porque n�o tem ordem
		 *  
		 *  grande vantagem � velocidade e performance
		 */
		
		/**
		 * Posso usar o mais gen�rico, ou classe m�e
		 * Collection<String alunos = new HashSet<>();
		 */
		
		Set<String> alunos = new HashSet<>();
		
		alunos.add("Rafael Viana");
		alunos.add("Novo aluno");
		alunos.add("Mais um aluno");
		alunos.add("Serio jo�o");
		alunos.add("Manoel distraido");
		alunos.add("Vei doid�o");
		alunos.add("Vei doid�o"); // s� aceita um objeto na lista.
		
		
		boolean rafaelEstaMatriculado = alunos.contains("Rafael Viana");
		System.out.println(rafaelEstaMatriculado);
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		System.out.println("***");
		
		alunos.forEach(aluno -> System.out.println(aluno));
		
	}

}
