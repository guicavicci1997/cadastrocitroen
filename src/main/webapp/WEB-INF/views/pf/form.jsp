<%@ page import="java.util.Date" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro Citroen</title>
</head>



<body>

<form:form action="${s:mvcUrl('PFC#gravar').build()}" method="post" commandName = "pessoaFisica">
    <div>
        <label>Nome</label>
        <input type="text" name="nome" />
        <form:errors path="nome" />
    </div>
    <div>
        <label>Sobrenome</label>
        <input type="text" name="sobrenome">
        <form:errors path="sobrenome" />
        <!--<form:errors path="sobrenome" /> -->
    </div>
    <div>
        <label>Data de Nascimento</label>
        <input type="text" name="dataNascimento" placeholder="yyyy/MM/dd"/>
    </div>
    <div>
        <label>Renda Mensal</label>
        <input type="text" name="rendaMensal" />
    </div>
    <div> 
    	<label>Opções de Carros</label>
        <select name= "carros">
        	<option>C3</option>
        	<option>Aircross</option>
        	<option>C4Lounge</option>
        	<option>C4Picasso</option>       
        </select>
                
    </div>
    <button type="submit">Cadastrar</button>
</form:form>

</body>
</html>