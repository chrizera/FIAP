package br.com.fiap.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/buscar")
public class AlunoServlet extends HttpServlet{
 public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 String nome = req.getParameter("nome");
	 String busca1 = req.getParameter("nome1");
	 String busca2 = req.getParameter("nome2");
	 String busca3 = req.getParameter("nome3");
	 
	 PrintWriter saida = resp.getWriter();
	 resp.setContentType("text/html");
	 
	 
	 if(nome.equals(busca1)){
		 System.out.println("Nome: " + nome);
		 saida.print("<html><body>Nome: " + nome + "</body></html>");
	 }
	 else if(nome.equals(busca2)){
		 System.out.println("Nome: " + nome);
		 saida.print("<html></body>Nome: " + nome + "</body></html>");
	 }
	 else if(nome.equals(busca3)){
		 System.out.println("Nome: " + nome);
		 saida.print("<html><body> Nome: " + nome + "</body></html>");
	 }
	 else {
		 System.out.println("N�o encontramos.");
		 saida.print("<html><body>Nenhum resultado encontrado.</body></html>");
	 }
 }
}
