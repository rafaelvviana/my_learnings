package br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * Classe representa uma Conta no ByteBank
 * 
 * @author Rafael Viana
 * @version 0.1
 *
 */


public abstract class Conta implements Comparable<Conta>, Serializable {
	
	protected double saldo;
	private int agencia;
	private int numero;
	private transient ClienteBanco titular;
	
	private static int total;
	
	/**
	 * Construtor para inicializar um objeto conta.
	 * 
	 * @param agencia
	 * @param numero
	 */
	public Conta(int agencia, int numero) {
				
		total++;
		this.agencia = agencia;
		this.numero = numero;

		System.out.println("Criando a conta. " + this.numero);		
	}
	
	
	public void deposita(double valor) {		
		this.saldo += valor;		
	}
	
	public void saca(double valor) throws SaldoInsuficienteException {
		
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo insuficiente. O saldo é: " + this.saldo);
		} 
		
		this.saldo -= valor;			
		
	}
	
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		
		this.saca(valor);
		destino.deposita(valor);
			
	}

	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public ClienteBanco getTitular() {
		return titular;
	}
	
	public void setTitular(ClienteBanco titular) {
		this.titular = titular;
	}

	public static int getTotal() {
		return total;
	}
	
	@Override
	public boolean equals(Object ref) {
		
		Conta outra = (Conta) ref;

		if(this.agencia != outra.agencia) {
            return false;
        }

        if(this.numero != outra.numero) {
            return false;
        }

        return true;		
	}
	
	@Override
	public String toString() {
		
		return "Número: " + this.getNumero();
	}
	
	
	// Ordem Natual da Classe para ordenação.
	@Override
	public int compareTo(Conta o) {		
		return Double.compare(this.saldo, o.saldo);
	}

}
