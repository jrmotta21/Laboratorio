<%-- 
    Document   : registrartrabajador
    Created on : 5/10/2014, 02:32:56 PM
    Author     : Junior
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
               <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
          <link rel="stylesheet" href="dist/bootstrap.min.css">

<script>src="dist/bootstrap.min.js"</script>
<!-- Latest compiled and minified JavaScript -->
<script src="dist/bootstrap.min.js"></script>
    </head>
    <body>
       
        
            <center><h1>Registro de Trabajador</h1></center>
             <center><table style="padding-top: 400px; width: 600px" class="table table-hover">
                     <form action="Sregistrar" method="post">
            <tr>
                <td>Apellido Paterno</td>
                <td><input type="text" name="ape_pater" value=""></td>
            </tr>
            <tr>
                <td>Apellido Materno</td>
                <td><input type="text" name="ape_mater" value=""></td>
            </tr>
            <tr>
                <td>Nombre</td>
                <td><input type="text" name="nombre" value=""></td>
            </tr>
            <tr>
                <td>Sexo</td>
                <td><select name="sexo">
                        <option value="m">Masculino</option>
                        <option value="f">Femenino</option>
                    </select> </td>
            </tr>
            <tr>    
                <td>Puesto</td>
                <td><input type="text" name="puesto" value=""></td>
            </tr>
            <tr>
                <td>Seguro afiliado</td>
                <td><select name="tipo">
                        <option value="s">ONP</option>
                        <option value="n">AFP</option>
                 </select></td>
            </tr>
            <tr>
                <td>Tipo de AFP</td>
                <td><select name="tipo_afp" >
                        <option value="0"></option>
                        <option value="1">INTEGRA</option>
                        <option value="2">PROFUTURO</option>
                        <option value="3">PRIMAX</option>
                        <option value="4">RIMAC</option>
                 </select></td>
            </tr>
            <tr>
                <td>Tipo de Pago</td>
                <td><select name="tip_pago">
                        <option value="salario">SALARIAL</option>
                        <option value="jornal">JORNAL</option>
                    </select></td>
            </tr>
            <tr>    
                <td>Hijos</td>
                <td><input type="number" min="0" value="0" name="texhijo"></td>
        </tr>
        <tr>
            <td>Sueldo</td>
            <td><input type="text" name="texsueldo" value=""</td>
        </tr>
        <tr>
            <td>Fecha de Ingreso</td>
            <td><input type="date" name="f_ingre"></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" style="margin-left: 40%"class="btn btn-primary" value="Registrar"></td></tr>
             </form>
                 </table>
       
             </center>
       
    </body>
</html>
