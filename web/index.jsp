<%-- 
    Document   : index.jsp
    Created on : 06-nov-2017, 21:05:01
    Author     : cice
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title>Tabla de multiplicar ${i}</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <% for (int i=1; i<=10; i++) {%>
            
        <h1>${i} x <%=i%> = <%Integer.parseInt(%>${i}<%)%>  </h1>
        <%}
        %>
    </body>
</html>
