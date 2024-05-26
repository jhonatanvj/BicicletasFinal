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

/**
 *
 * @author jhona
 */
@WebServlet(name = "Servelt2", urlPatterns = {"/Servelt2"})
public class Servelt2 extends HttpServlet {

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
            String tipoBicicleta = request.getParameter("tipobici");
            String color = request.getParameter("color");
            String marco = request.getParameter("marco");
            String rueda = request.getParameter("rueda");
            String plato = request.getParameter("plato");
            String piñon = request.getParameter("piñon");
            String sillin = request.getParameter("sillin");
            String operacion = request.getParameter("operacion");
            String email = (String) request.getSession().getAttribute("email");

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Facturación</title>");
            out.println("<link rel=\"stylesheet\" href=\"estilo3.css\">");
            out.println("</head>");
            out.println("<body>");
            out.println("<center>");
            out.println("<div id=\"facturación\"  class='mi-div'>");

            out.println("<h1>Facturación</h1>");
            out.println("<form action='Final' method='post'>"); 
            out.println("<p>Opreacion: " + operacion + "</p>");
            out.println("<p>Tipo de Bicicleta: " + tipoBicicleta + "</p>");
            out.println("<p>Color: " + color + "</p>");
            out.println("<p>Marco: " + marco + "</p>");
            out.println("<p>Rueda: " + rueda + "</p>");
            out.println("<p>Plato: " + plato + "</p>");
            out.println("<p>Piñon: " + piñon + "</p>");
            out.println("<p>Sillin: " + sillin + "</p>");
            out.println("<input type='hidden' name='email' value='" + email + "'>");
            out.println("<input type='hidden' id='operacion' name='operacion' value='" + operacion + "'>");
            out.println("<input type='submit' name='confirmar' value='Confirmar'>");
            out.println("</form>");
            out.println("</div>");
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
