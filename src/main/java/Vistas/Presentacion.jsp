<%-- 
    Document   : presentacion
    Created on : 4/07/2014, 08:25:39 PM
    Author     : T107
--%>


<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Calificaciones</title>
    </head>
    <body>
        <h1>Resultado De Calificaciones</h1>
        ${resultados.getNombre().obtenerEvaluacion()}
    </body>
</html>

