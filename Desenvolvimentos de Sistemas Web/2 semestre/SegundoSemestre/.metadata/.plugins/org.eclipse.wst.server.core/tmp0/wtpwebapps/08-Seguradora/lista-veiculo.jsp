<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="br.com.fiap.beans.Veiculo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel = "stylesheet" type = "text/css" href = "css/bootstrap.min.css">
</head>
<body>
 <% Veiculo veiculo = new Veiculo(); %>
 <% %>
 <% List<Veiculo> lista = (List<Veiculo>)request.getAttribute("chaveLista"); %>
 
 <div class = "container">
  <h1>Lista de Veiculos</h1>
  <table class = "table">
   <tr>
    <th>Modelo</th>
    <th>Ano</th>
    <th>Valor</th>
    <th>Montadora</th>
   </tr>
   <% for(Veiculo v : lista){ %>
   <tr>
    <td><%= v.getModelo() %></td>
    <td><%= v.getAno() %></td>
    <td><%= v.getValor() %></td>
    <td><%= v.getMontadora()%></td>
   </tr>
    <% } %>
  </table>
  <div>
   <a href = "cadastro-veiculo.jsp">Cadastrar ve�culo</a>
  </div>
 </div>
</body>
</html>