<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Novo Aluno</h1>
    <form action="/aluno/insert" method="post">
        <label>Nome</label>
        <input type="text" name="nome" />
        <label>idade</label>
        <input type"number" name="idade" />
        <button type="submit">Salvar</button>
    </form>
</body>
</html>