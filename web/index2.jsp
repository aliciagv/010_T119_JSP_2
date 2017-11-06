<%-- 
    Document   : index.jsp
    Created on : 06-nov-2017, 21:05:01
    Author     : cice
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>




<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <form>
            <label>Introduce un número : </label>
            <input TYPE ="text" name="numero"></input>
             <input type="submit" value="Enviar">
        </form>
        <%if (<%=request.getParameter("numero")%>!="null"){ %>
      
    </body>
</html>