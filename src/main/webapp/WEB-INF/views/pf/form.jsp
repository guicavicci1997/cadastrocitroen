<%@ page import="java.util.Date" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro Citroen</title>
</head>



<body>

<form action="/cadastrocitroen/pf" method="post">
    <div>
        <label>Nome</label>
        <form:errors path="pessoaFisica.nome" />
        <input type="text" name="nome" />
    </div>
    <div>
        <label>Sobrenome</label>
        <form:errors path="pf.sobrenome" />
        <input type="text" name="sobrenome">
    </div>
    <div>
        <label>Data de Nascimento</label>
        <form:errors path="pf.dataNascimento" />
        <input id="texto" type="texto" name="dataNascimento" placeholder="yyyy/MM/dd"/>
    </div>
    <div>
        <label>Renda Mensal</label>
        <form:errors path="pf.rendaMensal" />
        <input type="text" name="rendaMensal" />
        
        <ul>
        	<li>C3</li>
        	<li>Aircross</li>
        	<li>C4Lounge</li>
        	<li>C4Picasso</li>
        </ul>
        
    </div>
    <button type="submit">Cadastrar</button>
</form>

</body>
</html>