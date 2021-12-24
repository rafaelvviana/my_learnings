package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ControleBonificacao;
import br.com.bytebank.banco.modelo.Designer;
import br.com.bytebank.banco.modelo.EditorVideo;
import br.com.bytebank.banco.modelo.Gerente;

public class TesteReferencias {
	
	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		gerente.setNome("Rafael");
		gerente.setCpf("123456789");
		gerente.setSalario(15000.0);
				
		EditorVideo editor = new EditorVideo();
		editor.setNome("José");
		editor.setCpf("123456789");
		editor.setSalario(5000);
		
		Designer designer = new Designer();
		designer.setNome("João");
		designer.setCpf("123456789");
		designer.setSalario(6000);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(gerente);
		controle.registra(designer);
		controle.registra(editor);
		
		System.out.println(controle.getSomaBonificacoes());
		
	}

}
