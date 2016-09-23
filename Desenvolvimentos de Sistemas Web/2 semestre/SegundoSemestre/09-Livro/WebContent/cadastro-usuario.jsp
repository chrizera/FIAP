<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro usu�rio</title>
</head>
<body>
<div>

<c:if test="${not empty erro}">
 <div>${erro}</div>
</c:if>
 <form method = "post" action = "cadastrarUsuario">
  <label>Nome: </label>
  <input type = "text" name = "nome" id = "idNome">
  <label>Usu�rio: </label>
  <input type = "text" name = "usuario" id = "idUsuario">
  <label>Senha: </label>
  <input type = "password" name = "senha" id = "idSenha">
  <label>Repita a senha: </label>
  <input type = "password" id = "idRepeatSenha" name = "repeatSenha">
  <input type = "submit" value = "OK">
 </form>
</div>
</body>
</html>