<%-- 
    Document   : resultado
    Created on : 08-nov-2017, 21:26:11
    Author     : cice
--%>
<%
String resultado = request.getParameter("resultado");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>El resultado es: <%=resultado%> </h1>
    </body>
</html>
