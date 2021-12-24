package br.com.rvv.java.collections;

public class Aluno {
	
	private String nome;
	private int numeroMatricula;
	
	
	public Aluno(String nome, int numeroMatricula) {	
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
	
	/**
	 * Sempre que reescrever o EQUALS
	 * deve-se reescrever o HASHCOD
	 */

	@Override
	public boolean equals(Object obj) {		
		Aluno a = (Aluno) obj;		
		return this.nome.equals(a.nome);
	}
	
	@Override
	public int hashCode() {		
		return this.nome.hashCode();
	}
	
	@Override
	public String toString() {
	    return "[Aluno: " + this.nome + ", matricula: " + this.numeroMatricula + "]";
	}	

}
