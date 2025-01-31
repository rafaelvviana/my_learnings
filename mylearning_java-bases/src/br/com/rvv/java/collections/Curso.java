package br.com.rvv.java.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>(); // -->> sempre usar o List
	private Set<Aluno> alunos = new HashSet<>();
	
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		// unmodified n�o permite que a lista seja alterada, nem mesmo ordenar.
		return Collections.unmodifiableList(this.aulas);
	}
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(this.alunos);
	}

	public int getTempoTotal() {
		int tempoTotal = 0;
		for (Aula aula : aulas) {
			tempoTotal += aula.getTempo();
		}
		return tempoTotal;
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
	}

	@Override
	public String toString() {		
		return "[Curso: " + this.nome + ", tempo total: " + this.getTempoTotal() + ","
				+ " aulas: " + this.getAulas() + "]";
	}

	public boolean estaMatriculado(Aluno aluno) {		
		return this.alunos.contains(aluno);
	}

	public Aluno buscaMatriculado(int numero) {
		
		if(!matriculaParaAluno.containsKey(numero)) {
			throw new NoSuchElementException("matricula n�o encontrada" + numero);
		}
		return matriculaParaAluno.get(numero);
		
//		for (Aluno aluno: alunos) {
//			if(aluno.getNumeroMatricula() == numero) {
//				return aluno;
//			}
//		}		
//		throw new NoSuchElementException("matricula n�o encontrada" + numero);		
	}
	
}
