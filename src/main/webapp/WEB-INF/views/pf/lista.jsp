<%@ page import="java.util.Date" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro Citroen</title>
</head>

<body>

<h1>Lista de Pessoas Cadastradas</h1>

<div>${message}</div>

<table>
    <tr>
        <td>Nome</td>
        <td>Sobrenome</td>
        <td>Data de Nascimento</td>
        <td>Renda Mensal</td>
    </tr>

    <c:forEach items="${pf}" var="pf">
        <tr>
            <td>${pf.nome}</td>
            <td>${pf.sobrenome}</td>
            <td>${pf.dataNascimento}</td>
            <td>${pf.rendaMensal}</td>
            
        </tr>
    </c:forEach>
</table>

</body>
</html>