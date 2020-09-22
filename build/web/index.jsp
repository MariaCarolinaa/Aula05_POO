<%-- 
    Document   : index
    Created on : 21/09/2020, 21:26:35
    Author     : maria
--%>

<%@page import="ex1.horarios"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    horarios agora = new horarios(21, 36, 30);
    horarios intervalo = new horarios(20, 40, 30);
%>
<!DOCTYPE html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Horários</title>
    </head>
    
    <body>
        <h3>Hora Atual</h3>
        <%= agora.getHorario()%>
        <h3>Hora do intervalo</h3>
        <%= intervalo.getHorario()%> 
    </body>

    

