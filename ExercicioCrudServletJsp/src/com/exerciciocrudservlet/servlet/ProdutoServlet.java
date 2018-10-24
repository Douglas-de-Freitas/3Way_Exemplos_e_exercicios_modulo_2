package com.exerciciocrudservlet.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.exerciciocrudservlet.dao.ProdutoDao;
import com.exerciciocrudservlet.model.Produto;

@WebServlet("/ProdutoServlet")
public class ProdutoServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private ProdutoDao dao = new ProdutoDao();
	private static final String INSERIR_OU_EDITAR = "/produto.jsp";
	private static final String LISTAR_PRODUTOS = "/listarProdutos.jsp";
	
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("action");
		String redirecionaPagina = "";
		
		if(action.equalsIgnoreCase("listarProdutos")) {
			redirecionaPagina = LISTAR_PRODUTOS;
			request.setAttribute("produtos", dao.consultar());
		}else if(action.equalsIgnoreCase("editar")) {
			
		}else if(action.equalsIgnoreCase("deletar")) {
			
		}
		
		RequestDispatcher view = request.getRequestDispatcher(redirecionaPagina);
		view.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
