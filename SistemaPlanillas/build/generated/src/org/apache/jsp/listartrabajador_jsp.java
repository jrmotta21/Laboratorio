package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Pack_Bean.bean_trabajador;
import Pack_Dao.dao_trabajador;
import java.util.ArrayList;

public final class listartrabajador_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("          <link rel=\"stylesheet\" href=\"dist/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("<script>src=\"dist/bootstrap.min.js\"</script>\n");
      out.write("<!-- Latest compiled and minified JavaScript -->\n");
      out.write("<script src=\"dist/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <center><h1>LISTA DE EMPLEADOS</h1></center>\n");
      out.write("        <table style=\"padding-top: 200px; width: 600px\" class=\"table table-hover\" >\n");
      out.write("            <tr>\n");
      out.write("                <td>Codigo</td>\n");
      out.write("                <td>Apellido Paterno</td>\n");
      out.write("                <td>Apellido Materno</td>\n");
      out.write("                <td>Nombre</td>\n");
      out.write("                <td>Puesto</td>\n");
      out.write("                <td>Accion</td>\n");
      out.write("            </tr>             \n");
      out.write("        ");

                    ArrayList<bean_trabajador> lista= dao_trabajador.listartrabajador();
                    for(bean_trabajador b:lista){
                    
        
      out.write("\n");
      out.write("     \n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(b.getCod_trab());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(b.getApe_pater());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(b.getApe_mater());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(b.getNombre());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(b.getPuesto());
      out.write("</td>\n");
      out.write("                <td><a href=\"SGenerarcts?cod=");
      out.print(b.getCod_trab());
      out.write("\">Generar Planilla</a></td>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("        ");

               }
        
      out.write("\n");
      out.write("         \n");
      out.write("        </table>\n");
      out.write("    </center>\n");
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
