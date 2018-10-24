package com.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/NomeProfissao")
public class NomeProfissaoServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		
		String nome = req.getParameter("nome");
		String profissao = req.getParameter("profissao");
		
		PrintWriter out = resp.getWriter();
		out.println("<html><body><h1>"
				+ "Meu nome é " + nome + " e minha Profissao é " + profissao
				+ "</h1><br><h2>method get</h2><a href='/primeira-atividade'>Voltar</a></body></html>");
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		
		String nome = req.getParameter("nome");
		String profissao = req.getParameter("profissao");
		
		PrintWriter out = resp.getWriter();
		out.println("<html><body><h1>"
				+ "Meu nome é " + nome + " e minha Profissao é " + profissao
				+ "</h1><br><h2>method post</h2><a href='/primeira-atividade'>Voltar</a></body></html>");
		
	}

}
