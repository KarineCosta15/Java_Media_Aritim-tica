<%-- 
    Document   : Calcular
    Created on : 25 de abr. de 2022, 21:35:16
    Author     : karine
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculando a Média</title>
        <link rel="stylesheet" href= "estilo.css">
    </head>
    <body>
        
        <h3> Resultado do Cálculo </h3
        <p></p>
        
        <div class="break"></div>
        
        <form>
            <p> A Média Aritmética é: </p>
            <input type="text" size="10" value="<%= request.getAttribute("resultado") %>"><br>
            <p> <br> </p>
            <input type="button" value="Retornar" onclick="history.back()">
        </form>
    </body>
</html>
