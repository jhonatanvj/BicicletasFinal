/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servelt;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jhona
 */
@WebServlet(name = "ViewUsuario", urlPatterns = {"/ViewUsuario"})
public class ViewUsuario extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* Obtener los datos de la base de datos */
       HttpSession session = request.getSession();
            ResultSet contactos = (ResultSet)session.getAttribute("contactos");
      
            

            /* Escribir el HTML para mostrar los datos */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Usuarios</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Usuarios</h1>");
            out.println("<table border='1'>");
            out.println("<tr>");
            out.println("<th>ID</th>");
            out.println("<th>Nombre</th>");
            out.println("<th>Apellido</th>");
            out.println("<th>Articulos Comprados</th>");
            out.println("<th>Articulos Vendidos</th>");
            out.println("<th>Email</th>");
            out.println("<th>Contraseña</th>");
            out.println("</tr>");

            /* Iterar sobre el ResultSet y mostrar cada fila de datos */
            while (contactos.next()) {
                out.println("<tr>");
                out.println("<td>" + contactos.getInt("id") + "</td>");
                out.println("<td>" + contactos.getString("nombre") + "</td>");
                out.println("<td>" + contactos.getString("apellido") + "</td>");
                out.println("<td>" + contactos.getInt("compra") + "</td>");
                out.println("<td>" + contactos.getInt("venta") + "</td>");
                out.println("<td>" + contactos.getString("email") + "</td>");
                out.println("<td>" + contactos.getString("contraseña") + "</td>");
                out.println("</td>");
                out.println("</tr>");
            }
            out.println("</table>");
            out.println("<a href='index.jsp'>Volver a pagina inicial</a>");
            out.println("</body>");
            out.println("</html>");
        } catch (SQLException e) {
            e.printStackTrace();
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
