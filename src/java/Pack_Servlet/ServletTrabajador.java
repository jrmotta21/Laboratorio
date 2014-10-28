/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pack_Servlet;


import Pack_Bean.bean_trabajador;
import Pack_Dao.dao_trabajador;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Junior
 */
@WebServlet(name = "ServletTrabajador", urlPatterns = {"/ServletTrabajador","/SGenerarcts","/Scalcular","/Sregistrar"})
public class ServletTrabajador extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
          String path=request.getServletPath();
        //capturar valor de variable op que viene por la url
          String op=request.getParameter("op");
          if(path.equals("/SGenerarcts")){
        
             String cod=request.getParameter("cod");
             int cod1=Integer.parseInt(cod);
             ArrayList<bean_trabajador> trab=dao_trabajador.buscartrabajador(cod1);
             request.getSession().setAttribute("lista", trab);
             response.sendRedirect("generarcts.jsp?cod="+cod1+"");
        }
          if(path.equals("/Sregistrar")){
              
              String ape_pater=request.getParameter("ape_pater");
              String ape_mater=request.getParameter("ape_mater");
              String nombre=request.getParameter("nombre");
              String sexo=request.getParameter("sexo");
              String puesto=request.getParameter("puesto");
              String estado="1";
              String tipo=request.getParameter("tipo");
              String tipo_afi=request.getParameter("tipo_afp");
              String tip_pago=request.getParameter("tip_pago");
              String textsueldo=request.getParameter("texsueldo");
              String texhijo=request.getParameter("texhijo");
              String f_ingre=request.getParameter("f_ingre");
              
             
              
              bean_trabajador ast=new bean_trabajador();
              ast.setApe_pater(ape_pater);
              ast.setApe_mater(ape_mater);
              ast.setNombre(nombre);
              ast.setSexo(sexo);
              ast.setPuesto(puesto);
              ast.setEstado(estado);
              ast.setTrab_onp(tipo);
              ast.setCod_afp(Integer.parseInt(tipo_afi));
              ast.setTipo_pago(tip_pago);
              ast.setSueldo(Float.parseFloat(textsueldo));
              ast.setCant_hijos(Integer.parseInt(texhijo));
              ast.setF_ingre(f_ingre);            
              dao_trabajador.agregarTrabajador(ast);        
             response.sendRedirect("index.jsp");
        }
          if(path.equals("/Scalcular")){
              String cod=request.getParameter("texcodigo");
              String ext=request.getParameter("horaext");
              String descripcion=request.getParameter("descrip");
              String descu=request.getParameter("descu");
              request.getSession().setAttribute("extra", ext);
              request.getSession().setAttribute("descu", descu);
              request.getSession().setAttribute("desc", descripcion);
               request.getSession().setAttribute("codigo", cod);
//              ArrayList<bean_trabajador> trab=dao_trabajador.buscartrabajador(Integer.parseInt(cod));
//             request.getSession().setAttribute("listas", trab);
             response.sendRedirect("remuneracion.jsp?codigo="+cod+"");
//              response.sendRedirect("remuneracion.jsp?cod="+cod+"");
//              response.sendRedirect("index.jsp");
          }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
