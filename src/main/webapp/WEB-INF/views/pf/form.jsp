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

<form action="/cadastrocitroen/pf" method="post">
    <div>
        <label>Nome</label>
        <input type="text" name="nome" />
    </div>
    <div>
        <label>Sobrenome</label>
        <input type="text" name="sobrenome">
    </div>
    <div>
        <label>Data de Nascimento</label>
        <input id="texto" type="texto" name="dataNascimento" placeholder="yyyy/MM/dd"/>
    </div>
    <div>
        <label>Renda Mensal</label>
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