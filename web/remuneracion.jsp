<%-- 
    Document   : remuneracion
    Created on : 6/10/2014, 12:52:23 AM
    Author     : Junior
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page import="Pack_Dao.dao_trabajador"%>
<%@page import="Pack_Dao.dao_afp"%>
<%@page import="Pack_Bean.bean_afp"%>
<%@page import="Pack_Bean.bean_trabajador"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">		

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="dist/bootstrap.min.css">

<script>src="dist/bootstrap.min.js"</script>
<!-- Latest compiled and minified JavaScript -->
<script src="dist/bootstrap.min.js"></script>
        <title>PLANILLA X TRABAJADOR</title>
    </head>			



    <body>
     
    <center>
        <center><h1>PLANILLAS DEL MES</h1></center>
        <table class="table table-hover" style="padding-top: 50px;width: 400px" >
             <%     
                    String dao=(String)session.getAttribute("codigo");
                    session.removeAttribute("codigo");
                    int cod1=Integer.parseInt(dao);
                    ArrayList<bean_trabajador> list=dao_trabajador.buscartrabajador(cod1);
                            
                    for(bean_trabajador a:list){
            %>
            <tr>
                <td>Nombres</td>
                
                <td><%=a.getApe_pater()%> <%=a.getApe_mater()%> <%=a.getNombre()%></td>
            </tr> 
            <tr>
                <td>Sueldo</td>
                <td><%=a.getSueldo()%></td>
            </tr>
            <tr>
                <td>Asignacion Familiar</td>
                <% int cant=a.getCant_hijos();
                   int asigna=dao_trabajador.AsignacionFamiliar(cant);
                %>
                <td><%=asigna%></td>
            </tr>
            
             <tr>
                <td>Horas Extras</td>
                <%
                        String horas=(String)session.getAttribute("extra");
                        int extra=Integer.parseInt(horas);
                        String tipo_pago=a.getTipo_pago();
                        int cant_hijos=a.getCant_hijos();
                        float sueldo=a.getSueldo();
                        double pagoextra=dao_trabajador.calcularhoraextra(extra, tipo_pago, cant_hijos, sueldo);
                       
                    double pagoextra1=Math.rint(pagoextra*100)/100;
                %>
                <td><%=pagoextra1%></td>
               
            </tr>
            <tr>
                <td>Total</td>
                <%      
                    String tipo=a.getTipo_pago();
                    float sueldo1=a.getSueldo();
                    double total=dao_trabajador.total(tipo, sueldo1, pagoextra, asigna);
                     double total9=Math.rint(total*100)/100;     
                %>
                <td><%=total9%></td>
            </tr>
            <tr>
               
            </tr>
            
                <tr>
                    <td>Afiliacion</td>
                    
                <%
                String trab=a.getTrab_onp();
                int i=a.getCod_afp();
                bean_afp vean=dao_afp.buscarcodigo(i);
               float por=vean.getAfp_tasa();
                    double total1=dao_afp.porcentajes(trab, total, por);
                     double total30=Math.rint(total1*100)/100;
                    %>
                    <td><%=total30%></td>
               
            </tr>
            <tr>
                <td>Descuento Judicial</td>
                <%
                    String descu=(String)session.getAttribute("descu");
                    int desg=Integer.parseInt(descu);
                    
                %>
                <td><%=desg%></td>
            </tr>
            <tr>
                <td>5ta Categoria</td>
                <%
                float sueldo5=a.getSueldo();
                String pago7=a.getTipo_pago();
                double quintatatotal=dao_afp.quintacategoria(sueldo5, pago7, total);
                double quintatatotal1=Math.rint(quintatatotal*100)/100; 
                %>
                <td><%=quintatatotal1%></td>
            </tr>
            <tr>
                <td>Total Descuento</td>
                
                <%
                double totaldesc=total1+desg+quintatatotal;
                double totaldesc1=Math.rint(totaldesc*100)/100; 
                %>
                
                <td><%=totaldesc1%></td>
            </tr>
            <tr>
                <td>Neto a Pagar</td>
                <%
                double netopaga=total-totaldesc;
                double netopaga1=Math.rint(netopaga*100)/100; 
                %>
                <td><%=netopaga1%></td>
            </tr>
            <tr>
                <td>ESSALUD 9%</td>
                <%
                double essalud=total*0.09;
                double essalud1=Math.rint(essalud*100)/100; 
                %>
                <td><%=essalud1%></td>
            </tr>
            <tr>
                <td>Campo Vacio</td>
                <%
                int vacio=0;
                
                %>
                <td><%=vacio%></td>
            </tr>
            <tr>
                <td>Total Aporte</td>
                <%
                 double totalaporte=essalud+vacio;
                  double totalaporte1=Math.rint(totalaporte*100)/100; 
                %>
                <td><%=totalaporte1%></td>
            </tr>
           

            <%
                                 }
                           
                                               
            %>
            <tr>
                <td><a href="index.jsp">Volver</a></td>
                <td><input type="button" onclick="window.print();" value="Imprimir"></td>
            </tr>
            
    </center>
        </table>
    </body>
</html>
