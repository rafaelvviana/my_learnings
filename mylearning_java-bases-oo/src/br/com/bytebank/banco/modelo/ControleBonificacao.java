package br.com.bytebank.banco.modelo;

public class ControleBonificacao {
	
	private double somaBonificacoes;
	
	public void registra(Funcionario f) {		
		double bonificacao = f.getBonificacao();
		this.somaBonificacoes += bonificacao;
	}
	
//	public void registra(Gerente g) {		
//		double bonificacao = g.getBonificacao();
//		this.somaBonificacoes += bonificacao;
//	}

//	public void registra(EditorVideo v) {		
//		double bonificacao = v.getBonificacao();
//		this.somaBonificacoes += bonificacao;
//	}
	
	public double getSomaBonificacoes() {
		return somaBonificacoes;
	}

	public void setSomaBonificacoes(double somaBonificacoes) {
		this.somaBonificacoes = somaBonificacoes;
	}

}
