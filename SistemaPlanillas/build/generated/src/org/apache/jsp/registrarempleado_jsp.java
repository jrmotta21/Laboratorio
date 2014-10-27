package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registrarempleado_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("               <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("          <link rel=\"stylesheet\" href=\"dist/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("<script>src=\"dist/bootstrap.min.js\"</script>\n");
      out.write("<!-- Latest compiled and minified JavaScript -->\n");
      out.write("<script src=\"dist/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("        \n");
      out.write("            <center><h1>Registro de Trabajador</h1></center>\n");
      out.write("             <center><table style=\"padding-top: 400px; width: 600px\" class=\"table table-hover\">\n");
      out.write("                     <form action=\"Sregistrar\" method=\"post\">\n");
      out.write("            <tr>\n");
      out.write("                <td>Apellido Paterno</td>\n");
      out.write("                <td><input type=\"text\" name=\"ape_pater\" value=\"\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Apellido Materno</td>\n");
      out.write("                <td><input type=\"text\" name=\"ape_pater\" value=\"\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Nombre</td>\n");
      out.write("                <td><input type=\"text\" name=\"nombre\" value=\"\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Sexo</td>\n");
      out.write("                <td><select name=\"sexo\">\n");
      out.write("                        <option value=\"m\">Masculino</option>\n");
      out.write("                        <option value=\"f\">Femenino</option>\n");
      out.write("                    </select> </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>    \n");
      out.write("                <td>Puesto</td>\n");
      out.write("                <td><input type=\"text\" name=\"puesto\" value=\"\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Fecha de Ingreso</td>\n");
      out.write("                <td><input type=\"date\" name=\"fecha_ing\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Seguro afiliado</td>\n");
      out.write("                <td><select name=\"tipo\">\n");
      out.write("                        <option value=\"opn\">ONP</option>\n");
      out.write("                        <option value=\"afp\">AFP</option>\n");
      out.write("                 </select></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Tipo de AFP</td>\n");
      out.write("                <td><select name=\"tipo_afp\" >\n");
      out.write("                        <option value=\"0\"></option>\n");
      out.write("                        <option value=\"1\">INTEGRA</option>\n");
      out.write("                        <option value=\"2\">PROFUTURO</option>\n");
      out.write("                        <option value=\"3\">PRIMAX</option>\n");
      out.write("                        <option value=\"4\">RIMAC</option>\n");
      out.write("                 </select></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Tipo de Pago</td>\n");
      out.write("                <td><select name=\"tip_pago\">\n");
      out.write("                        <option value=\"salari0\">SALARIAL</option>\n");
      out.write("                        <option value=\"jornal\">JORNAL</option>\n");
      out.write("                    </select></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>    \n");
      out.write("                <td>Hijos</td>\n");
      out.write("                <td><input type=\"number\" min=\"0\" value=\"0\" name=\"texhijo\"></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Sueldo</td>\n");
      out.write("            <td><input type=\"text\" name=\"texsueldo\" value=\"\"</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td colspan=\"2\"><input type=\"submit\" style=\"margin-left: 40%\"class=\"btn btn-primary\" value=\"Registrar\"/></td></tr>\n");
      out.write("             </form>\n");
      out.write("                 </table>\n");
      out.write("       \n");
      out.write("             </center>\n");
      out.write("       \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
