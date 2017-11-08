<%-- 
    Document   : index.jsp
    Created on : 06-nov-2017, 21:05:01
    Author     : cice
--%>

<%
    String numero1 = request.getParameter("numero1");
    int inumero1 = Integer.parseInt(request.getParameter("numero1"));
    String numero2 = request.getParameter("numero2");
    int inumero2 = Integer.parseInt(request.getParameter("numero2"));
    String operacion = request.getParameter("operacion");


%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title>Tabla de multiplicar <%=request.getParameter("numero")%></title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>

        <p>El número 1 es: <%=inumero1%> </p> <!-- expresion y scriptlet -->
        <p>El número 2 es: <%=inumero2%> </p> <!-- expresion y scriptlet -->
        <p>La operacion es: <%=operacion%> </p> 
        <% 
            
            switch (operacion) {
                case "sumar":
               out.println("La suma es: "+ (inumero1+inumero2) ); 
              
                        
                      
                    break;
                case "restar":
                       %> 
                  <p>La resta es: <%=inumero1 - inumero2%> </p>      
                        
                      <%
                    break;
                case "multiplicar":
                       %> 
                  <p>La multiplicación es: <%=inumero1 * inumero2%> </p>      
                        
                      <%
                    break;
                case "dividir":
                        %> 
                  <p>La división es: <%=inumero1 / inumero2%> </p>      
                        
                      <%
                    break;
                default:
                    throw new AssertionError();
            }
        %>

    </body>
</html>
