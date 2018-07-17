<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro Citroen</title>
</head>
<body>

<form action="/pf" method="post">
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
        <input type="date" name="paginas" />
    </div>
    <div>
        <label>Renda Mensal</label>
        <input type="text" name="rendaMensal" />
    </div>
    <button type="submit">Cadastrar</button>
</form>

</body>
</html>