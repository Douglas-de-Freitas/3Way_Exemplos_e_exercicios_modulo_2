package com.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.modelo.Livro;

@WebServlet("/RetornaListaServlet")
public class RetornaListaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RetornaListaServlet() {
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Livro livro1 = new Livro("Fernando Pessoa", "EXTRAORDINARIO", "descricao1");
		Livro livro2 = new Livro("Carlos Drummond de Andrade", "ALICE - EDIÇÃO COMEMORATIVA DE 150 ", "descricao2");
		Livro livro3 = new Livro("Johann Goethe", "THE LITTLE PRINCE", "descricao3");
		Livro livro4 = new Livro("Mario Quintana", "O PEQUENO PRÍNCIPE", "descricao4");
		Livro livro5 = new Livro("Clarice Lispector", "A REVOLUÇÃO DOS BICHOS", "descricao5");
		Livro livro6 = new Livro("S. Handel", "O PODER DO HÁBITO", "descricao6");
		
		List<Livro> livros = new ArrayList<>();
		livros.add(livro1);
		livros.add(livro2);
		livros.add(livro3);
		livros.add(livro4);
		livros.add(livro5);
		livros.add(livro6);
		
		//listar na requisição
		request.setAttribute("listaLivro", livros);
		
		// selecionar
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/listarLivros.jsp");
		rd.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
