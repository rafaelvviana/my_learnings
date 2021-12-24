package br.com.bytebank.banco.modelo;

/**
 * Classe representa Cliente no ByteBank
 * 
 * @author Rafael Viana
 * @version 0.1
 * 
 *
 */


public class ClienteBanco {

	// implements Serializable 	
	// se o atributo é transient não precisa serializar  
	
	private String nome;
	private String cpf;
	private String profissao;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	

}
