package br.com.bytebank.banco.modelo;

public interface Autenticavel {
	
	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);
	
}
