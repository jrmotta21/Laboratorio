<%-- 
    Document   : HorasExtra
    Created on : 27/10/2014, 01:33:49 PM
    Author     : Junior
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%          String hora=(String)session.getAttribute("hora1");
        %>
        
        <h1><%=hora%></h1>
    </body>
</html>
