package br.com.alura.gerenciador.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;

public class RemoveEmpresa implements Acao {

	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("a��o removendo empresa");
		
		String paramId = request.getParameter("id");
		Integer id = Integer.parseInt(paramId);
		
		Banco banco = new Banco();
		banco.remore(id);
		
		return "redirect:entrada?acao=ListaEmpresas";
		
	}
	
}
