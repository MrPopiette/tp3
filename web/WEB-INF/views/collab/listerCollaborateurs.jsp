<%--
  Created by IntelliJ IDEA.
  User: Maxime.M
  Date: 10/10/2019
  Time: 14:53
  To change this template use File | Settings | File Templates.
--%>
<%@page import="java.util.List"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>SGP - App</title>
</head>
<body>
<h1>Les collaborateurs</h1>
<ul>
    <%
        List<String> listeNoms =(List<String>)request.getAttribute("listeNoms");
        for (String nom : listeNoms) {
    %>
    <li><%= nom %></li>
    <%
        }
    %>
</ul>
</body>
</html>