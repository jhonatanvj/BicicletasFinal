/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servelt;

import ConexionBD.DatosConexion;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author jhona
 */
@WebServlet(name = "VerificarUsuario", urlPatterns = {"/VerificarUsuario"})
public class VerificarUsuario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String email = request.getParameter("email");
        String contraseña = request.getParameter("contraseña");
        boolean usuarioValido = false;
        PrintWriter out = response.getWriter();
        DatosConexion conDb = new DatosConexion();
        try {
            usuarioValido = conDb.verificarUsuario(email, contraseña);
        }catch(Exception e){
            
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Inicio</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Error at " + e.toString() + "</h1>");
            out.println("<p>seguimiento: "+conDb.getMensaje()+"</p>");
            out.println("</body>");
            out.println("</html>");
            
        }
       
        if (usuarioValido) {
            request.getSession().setAttribute("email", email);
            // Usuario válido, redirigir a otra página
            response.sendRedirect("Servlet1");
        } else {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Error</title>");  
            out.println("<link rel=\"stylesheet\" href=\"estilo3.css\">");
            
            out.println("</head>");
            out.println("<center>");
            out.println("<body>");
            out.println("<div id=\"noEnc\"  class='mi-div'>");
            out.println("<h1> Usuario No Encontrado </h1>");
            out.println("<a href=\"index.jsp\">Volver</a>");
            out.println("</center>");
            out.println("</body>");
            out.println("</html>");
        }
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
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
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
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
