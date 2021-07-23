/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Marce
 */
@WebServlet(urlPatterns = {"/checkuser"})
public class checkuser extends HttpServlet {

    private HttpServletResponse response;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @return 
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.sql.SQLException
     */
    protected String processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            persistencia base;
            base = new persistencia();
            ResultSet rs = base.consultaSQL("select * from usuarios");
            
            if(rs.first() == false){
                out.println("No hay usuarios que coincidan con la busqueda");
            }else{
            
              while(rs.next()){
                  out.println(rs.getString("usuarios"));
                  out.println(rs.getString("clave"));
                  out.println(rs.getString("nombreyapellido")+"<br>");
              }
              
              out.println("<h1>Servlet checkuser at " + request.getContextPath() + "</h1>");
              out.println("<h1> El usuario ingresado es: " + request.getParameter("inputEmail") + "</h1>");
            
        }
     
        }
      
       catch (SQLException ex) {
            Logger.getLogger(checkuser.class.getName()).log(Level.SEVERE, null, ex);
        }
       

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
       
    

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    //void doPost(HttpServletRequest request = null, HttpServletResponse response) throws IOException {
      //  try {
           // processRequest(request, response);
       // } catch (ServletException ex) {
       //     Logger.getLogger(checkuser.class.getName()).log(Level.SEVERE, null, ex);
        
      //  } catch (IOException ex) {
       //     Logger.getLogger(checkuser.class.getName()).log(Level.SEVERE, null, ex);
       // }
    

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    //@Override
    //  String getServletInfo() {
    //    return "Short description";
    //}// </editor-fold>
//}
//}
