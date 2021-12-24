package br.com.rvv.java.collections;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {
	
	public static void main(String[] args) {
		
		/**
		 *  HashSet
		 *  não aceita objetos repetidos
		 *  não tem get, porque não tem ordem
		 *  
		 *  grande vantagem é velocidade e performance
		 */
		
		/**
		 * Posso usar o mais genérico, ou classe mãe
		 * Collection<String alunos = new HashSet<>();
		 */
		
		Set<String> alunos = new HashSet<>();
		
		alunos.add("Rafael Viana");
		alunos.add("Novo aluno");
		alunos.add("Mais um aluno");
		alunos.add("Serio joão");
		alunos.add("Manoel distraido");
		alunos.add("Vei doidão");
		alunos.add("Vei doidão"); // só aceita um objeto na lista.
		
		
		boolean rafaelEstaMatriculado = alunos.contains("Rafael Viana");
		System.out.println(rafaelEstaMatriculado);
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		System.out.println("***");
		
		alunos.forEach(aluno -> System.out.println(aluno));
		
	}

}
