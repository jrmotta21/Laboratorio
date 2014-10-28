<%-- 
    Document   : listartrabajador
    Created on : 5/10/2014, 02:32:35 PM
    Author     : Junior
--%>

<%@page import="Pack_Bean.bean_trabajador"%>
<%@page import="Pack_Dao.dao_trabajador"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
          <link rel="stylesheet" href="dist/bootstrap.min.css">

<script>src="dist/bootstrap.min.js"</script>
<!-- Latest compiled and minified JavaScript -->
<script src="dist/bootstrap.min.js"></script>
    </head>
    <body>
    <center>
        <center><h1>LISTA DE EMPLEADOS</h1></center>
        <table style="padding-top: 200px; width: 600px" class="table table-hover" >
            <tr>
                <td>Codigo</td>
                <td>Apellido Paterno</td>
                <td>Apellido Materno</td>
                <td>Nombre</td>
                <td>Puesto</td>
                <td>Accion</td>
            </tr>             
        <%
                    ArrayList<bean_trabajador> lista= dao_trabajador.listartrabajador();
                    for(bean_trabajador b:lista){
                    
        %>
     
            <tr>
                <td><%=b.getCod_trab()%></td>
                <td><%=b.getApe_pater()%></td>
                <td><%=b.getApe_mater()%></td>
                <td><%=b.getNombre()%></td>
                <td><%=b.getPuesto()%></td>
                <td><a href="SGenerarcts?cod=<%=b.getCod_trab()%>">Generar Planilla</a></td>
                
            </tr>

        <%
               }
        %>
         
        </table>
    </center>
    </body>
</html>
