<%-- 
    Document   : generarcts
    Created on : 5/10/2014, 04:44:42 PM
    Author     : Junior
--%>

<%@page import="Pack_Dao.dao_afp"%>
<%@page import="Pack_Bean.bean_afp"%>
<%@page import="Pack_Bean.bean_trabajador"%>
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
<script>
        function nuevaVentana() {
            window.open("HorasExtra.jsp", "Horas",
            "toolbar=no, location=no, directories=no, status=no, menubar=no, \
            scrollbars=no, resizable=no, copyhistory=no, width=400, height=200");
        }
</script>
    </head>
    
    <body>
    <center>
        <center><h1 >Datos de Planilla</h1></center>
        <table class="table table-hover" style="padding-top: 50px;width: 400px">
 
     
            <%
                    ArrayList<bean_trabajador> list=(ArrayList<bean_trabajador>)session.getAttribute("lista");
                    session.removeAttribute("lista");
                    for(bean_trabajador a:list){
            %>
             <form action="Scalcular" method="post">
            <tr>
                <td>Nombres</td>
                <td><%=a.getApe_pater()%> <%=a.getApe_mater()%> <%=a.getNombre()%></td>  
            </tr>
            <tr>
                <td>Codigo</td>
                <td><input type="text" name="texcodigo"  value="<%=a.getCod_trab()%>"/></td>
               
            </tr>
            <tr>
                <td>Tipo de Pago</td>
                <td><%=a.getTipo_pago()%></td>
            </tr>
            <tr>
                <td>Indicar Horas extras</td>
                <td> <input type="number" min="0"  name="horaext"  value="0"></td>
                <% String hor=request.getParameter("horaext");
                %>
                <td><input type="button" value="Horas" onclick="nuevaVentana()" /></td>
            </tr>
            <tr>
                <td>Tipo de afialiacion</td>
                <%
                 
                if(a.getTrab_onp().equals("s")){
                    %>
                    <td><input type="text" name="descrip"  value="ONP" /></td>
                    <%
                                     }
               int code=a.getCod_afp();
                if(a.getTrab_onp().equals("n")){
                      ArrayList<bean_afp> lista=dao_afp.listartrabajador(code);
                       for(bean_afp c:lista){
                    %>
                    <td><input type="text" name="descrip" value="<%=c.getAfp_descrip()%>" /></td>
                    <%
                  
                       } 
                                   }    
        
                %>
            </tr>
            <tr>
            <td>Asignacion Familiar</td>
            <%
                if(a.getCant_hijos()>0){
                               %>
                               <td><input type="text"  disabled="disabled"  name="asig"value="SI"/></td>               
            <%        
                }
                 else{
            %>
            <td><input type="text"  disabled="disabled"  name="asig" value="NO"/></td>
            </tr>
            <%
                       }
               %>
               <tr>
                   <td>Salario mensual</td>
                   <%
                      if(a.getTipo_pago().equals("salario")){
                      %>
                      <td><input type="text"  disabled="disabled"  name="texpago" value="<%=a.getSueldo()%>" /></td>
                      <%
                      }else{
                   float k=a.getSueldo()*30;
                   %>
                   <td><input type="text"  disabled="disabled"  name="texpago" value="<%=k%>" /></td>
                   <%
                      }
                   %>
               </tr>
               <tr>
                   <td>Descuento Judicial</td>
                   <td><input type="number" min="0"  name="descu"  value="0" ></td>
               </tr>
               <tr>
                   <td><input type="submit" value="Generar"></td>
               </tr>
                </form>
            <%
            
               }
            %>
            
        </table>
    </center>
    </body>
</html>
