/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servelt;

import Modelo.Bicicleta;
import Modelo.BicicletaBMX;
import Modelo.BicicletaMontaña;
import Modelo.BicicletaRuta;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 *
 * @author jhona
 */
@WebServlet(name = "Servlet1", urlPatterns = {"/Servlet1"})
public class Servlet1 extends HttpServlet {

    public static Bicicleta bi;

    public static void liskov(Bicicleta b) {
        b.asignarColor();
        b.asignarMarco();
        b.asignarPiñon();
        b.asignarPlato();
        b.asignarRueda();
        b.asignarSillin();
        bi = b;
    }

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

        Bicicleta bicicleta = null;
        String tipoBicicleta = request.getParameter("tipoBicicleta");

        if ("BMX".equals(tipoBicicleta)) {
            bicicleta = new BicicletaBMX();
            liskov(bicicleta);
        } else if ("Montaña".equals(tipoBicicleta)) {
            bicicleta = new BicicletaMontaña();
            liskov(bicicleta);
        } else if ("Ruta".equals(tipoBicicleta)) {
            bicicleta = new BicicletaRuta();
            liskov(bicicleta);
        }

        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Personalización</title>");
            out.println("<link rel=\"stylesheet\" href=\"estilo2.css\">");
            out.println("<script src='funcionalidad.js' defer></script>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class='centered-container'>"); // Añadir este div

            out.println("<div style='text-align: center;'>"); // Centrando el contenido dentro del div
            out.println("<button onclick=\"location.href='Servlet1?tipoBicicleta=BMX'\">BMX</button>");
            out.println("<button onclick=\"location.href='Servlet1?tipoBicicleta=Ruta'\">RUTA</button>");
            out.println("<button onclick=\"location.href='Servlet1?tipoBicicleta=Montaña'\">MONTAÑA</button>");
            out.println("</div>");
            out.println("<br>");

            if (bicicleta != null) {
                generateForm(out, bicicleta, tipoBicicleta);
            }

            out.println("</div>"); // Cerrar este div
            out.println("</body>");
            out.println("</html>");
        }
    }

    private void generateForm(PrintWriter out, Bicicleta bicicleta, String tipoBicicleta) {
        out.println("<form action='Servelt2' method='post'>");
        out.println("<div id='form" + tipoBicicleta.toUpperCase() + "' class='mi-div' style='display: block;'>");
        generateSelect(out, "Color", "color", bicicleta.getColor());
        generateSelect(out, "Marco", "marco", bicicleta.getMarco());
        generateSelect(out, "Rueda", "rueda", bicicleta.getRueda());
        generateSelect(out, "Plato", "plato", bicicleta.getPlato());
        generateSelect(out, "Piñon", "piñon", bicicleta.getPiñon());
        generateSelect(out, "Sillin", "sillin", bicicleta.getSillin());

        out.println("<br><br>");
        out.println("<input type='submit' value='Facturar'>");
        out.println("</div>");
        out.println("</form>");
    }

private void generateSelect(PrintWriter out, String label, String name, Map<String, Integer> options) {
    out.println("<h2>" + label + "</h2>");
    out.println("<select id='" + name + "' name='" + name + "'>");
    for (Map.Entry<String, Integer> entry : options.entrySet()) {
        out.println("<option value='" + entry.getKey() + "'>" + entry.getKey() + " - $" + entry.getValue() + "</option>");
    }
    out.println("</select>");
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
