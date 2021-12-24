package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

/**
 * Servlet implementation class AlteraEmpresaServlet
 */
@WebServlet("/alteraEmpresa")
public class AlteraEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("Alterando a empresa.");
		
		String nomeEmpresa = request.getParameter("nomeEmpresa");
		String sDataAbertura = request.getParameter("dataAbertura");
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);

		Date dDataAbertura = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dDataAbertura = sdf.parse(sDataAbertura);
		} catch (ParseException e) {		
			throw new ServletException(e.getMessage());
		}
		
		Banco banco = new Banco();
		Empresa empresa = banco.buscaEmpresaPelaId(id);
		empresa.setNome(nomeEmpresa);
		empresa.setDataAbertura(dDataAbertura);
		
		response.sendRedirect("listaEmpresas");
		
	}

}
