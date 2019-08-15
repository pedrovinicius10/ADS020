<%-- 
    Document   : ola
    Created on : 14/08/2019, 21:38:09
    Author     : 18114290042
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Diga ola</title>
    </head>
    <%
        String nome = request.getParameter("nome");
        if (nome == null || nome.isEmpty()) {
    %>
    <h1>Olá Mundo!</h1>
    <%
    } else {
    %>
    <h1>Olá <%=nome%>!</h1>
    <%
        }
    %>
    <p>Você está acessando uma página JSP.</p>
    
    <%java.util.Date data = new java.util.Date();%>
    <%=data%>
    