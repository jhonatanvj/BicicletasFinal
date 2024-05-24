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
@WebServlet(name = "Servlet1", urlPatterns = {"/Servlet1"})
public class Servlet1 extends HttpServlet {

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
        try ( PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            
            out.println("<head>");
            out.println("<title>Personalización</title>");
            out.println("<link rel=\"stylesheet\" href=\"estilo2.css\">");
            out.println("<script src='funcionalidad.js' defer></script>");
            out.println("</head>");
            
            out.println("<body>");
            out.println("<center>");
            out.println("<button onclick=\"toggleForm('formBMX')\">BMX</button>");
            out.println("<button onclick=\"toggleForm('formRUTA')\">RUTA</button>");
            out.println("<button onclick=\"toggleForm('formMONTAÑA')\">MONTAÑA</button>");
            out.println("</center>");
            
            out.println("<br>");
            /**Formulario para BMX**/
            out.println("<center>");
            
            out.println("<form action='Servelt2' method='post'>");
            out.println("<div id=\"formBMX\" style=\"display: none;\" class='mi-div'>");
            
                        out.println("<h2>Color</h2>");
                        out.println("<select id=\"color\" name=\"color\">");
                        out.println("<option value='Rojo'>Rojo $30.000</option>");
                        out.println("<option value='Blanco'>Blanco $20.000</option>");
                        out.println("<option value='Negro'>Negro $20.000</option>");
                        out.println("<option value='Azul'>Azul $30.000</option>");
                        out.println("<option value='Amarillo'>Amarillo $30.000</option>");
                        out.println("</select>");
                        
                        out.println("<h2>Marco</h2>");
                        out.println("<select id=\"marco\" name=\"marco\">");
                        out.println("<option value='XS'>XS $1'200.000</option>");
                        out.println("<option value='S'>S $1'200.000</option>");
                        out.println("<option value='M'>M $1'400.000</option>");
                        out.println("<option value='L'>L $1'500.000</option>");
                        out.println("<option value='XL'>XL $1'500.000</option>");
                        out.println("</select>");
                        
                        
                        out.println("<h2>Rueda</h2>");
                        out.println("<select id=\"rueda\" name=\"rueda\">");
                        out.println("<option value='Odyssey'>Odyssey $300.000</option>");
                        out.println("<option value='Shadow Conspiracy'>Shadow Conspiracy $350.000</option>");
                        out.println("<option value='Primo'>Primo $400.000</option>");
                        out.println("<option value='Cinema'>Cinema $700.000</option>");
                        out.println("<option value='Éclat'>Éclat $730.000</option>");
                        out.println("</select>");
                           
                        
                        out.println("<h2>Plato</h2>");
                        out.println("<select id=\"plato\" name=\"plato\">");
                        out.println("<option value='Platos de una sola pieza'>Platos de una sola pieza $150.000</option>");
                        out.println("<option value='Platos de tres piezas'>Platos de tres piezas $200.000</option>");
                        out.println("<option value='Platos estilo sprocket'>Platos estilo sprocket $250.000</option>");
                        out.println("</select>");
                        
                        out.println("<h2>Piñon</h2>");
                        out.println("<select id=\"piñon\" name=\"piñon\">");
                        out.println("<option value='Piñones Freewheel'>Piñones Freewheel</option>");
                        out.println("<option value='Piñones Cassette'>Piñones Cassette</option>");
                        out.println("</select>");
                        
                        
                        out.println("<h2>Sillin</h2>");
                        out.println("<select id=\"sillin\" name=\"sillin\">");
                        out.println("<option value='Fiend'>Fiend $70.000</option>");
                        out.println("<option value='Shadow Conspiracy'>Shadow Conspiracy $80.000</option>");
                        out.println("<option value='BSD'>BSD $90.000</option>");
                        out.println("<option value='Animal Bikes'>Animal Bikes $100.000</option>");
                        out.println("<option value='Cult'>Cult $105.000</option>");
                        out.println("</select>");
                        
                        out.println("<br>");
                        out.println("<br>");
                        out.println("<input type=\"submit\" value=\"Facturar\">");
                        out.println("</div>");

                        out.println("</form>");
                        out.println("</center>");



                /**Formulario para RUTA**/
                  out.println("<center>");
                  out.println("<div id=\"formRUTA\" style=\"display: none;\" class=\"mi-div\">" );
                  out.println("<form action='Servelt2' method='post'>");
            
            
                
                        out.println("<h2>Color</h2>");
                        out.println("<select id=\"color\" name=\"color\">");
                        out.println("<option value='Rojo'>Rojo $30.000</option>");
                        out.println("<option value='Blanco'>Blanco $20.000</option>");
                        out.println("<option value='Negro'>Negro $20.000</option>");
                        out.println("<option value='Azul'>Azul $30.000</option>");
                        out.println("<option value='Amarillo'>Amarillo $30.000</option>");
                        out.println("</select>");
                
                
                        out.println("<h2>Marco</h2>");
                        out.println("<select id=\"marco\" name=\"marco\">");
                        out.println("<option value='XS'>XS $3'200.000</option>");
                        out.println("<option value='S'>S $3'500.000</option>");
                        out.println("<option value='M'>M $3'400.000</option>");
                        out.println("<option value='L'>L $3'520.000</option>");
                        out.println("<option value='XL'>XL $3'550.000</option>");
                        out.println("</select>");
                
                
                        out.println("<h2>Rueda</h2>");
                        out.println("<select id=\"rueda\" name=\"rueda\">");
                        out.println("<option value=\"DT Swiss\">DT Swiss $100.000</option>");
                        out.println("<option value=\"Mavic\">Mavic $120.000</option>");
                        out.println("<option value=\"Stan's No Tubes\">Stan's No Tubes $130.000</option>");
                        out.println("<option value=\"Industry Nine\">Industry Nine $140.000</option>");
                        out.println("<option value=\"Hope Technology\">Hope Technology $150.000</option>");
                        out.println("</select><br>");
                
                
                        out.println("<h2>Plato</h2>");
                        out.println("<select id=\"plato\" name=\"plato\">");
                        out.println("<option value=\"34-39\">34-39 $150.000</option>");
                        out.println("<option value=\"39-42\">39-42 $160.000</option>");
                        out.println("<option value=\"38-42\">38-42 $170.000</option>");
                        out.println("<option value=\"50-53\">50-53 $180.000</option>");
                        out.println("<option value=\"30-34\">30-34 $190.000</option>");
                        out.println("</select><br>");


                        out.println("<h2>Piñon</h2>");
                        out.println("<select id=\"piñon\" name=\"piñon\">");
                        out.println("<option value=\"Cassette de rango amplio\">Cassette de rango amplio $300.000</option>");
                        out.println("<option value=\"Cassette de rango estrecho\">Cassette de rango estrecho $400.000</option>");
                        out.println("</select><br>");
                
                
                        out.println("<h2>Sillin</h2>");
                        out.println("<select id=\"sillin\" name=\"sillin\">");
                        out.println("<option value=\"WTB\">WTB $80.000</option>");
                        out.println("<option value=\"SDG\">SDG $85.000</option>");
                        out.println("<option value=\"Fizik\">Fizik $90.000</option>");
                        out.println("<option value=\"Ergon\">Ergon $95.000</option>");
                        out.println("<option value=\"Fabric\">Fabric $100.000</option>");
                        out.println("</select><br>");

                        out.println("<br>");
                        out.println("<input type=\"submit\" value=\"Facturar\">");
                        out.println("</div>");

                        out.println("</form>");
                        out.println("</center>");
                
                
                /**Formulario para MONTAÑA**/
                
                        out.println("<center>");

                        out.println("<form action='Servelt2' method='post'>");
                        out.println("<div id=\"formMONTAÑA\" style=\"display: none;\" class= 'mi-div'>");
                
                        out.println("<h2>Color</h2>");
                        out.println("<select id=\"color\" name=\"color\">");
                        out.println("<option value='Rojo'>Rojo $70.000</option>");
                        out.println("<option value='Blanco'>Blanco $60.000</option>");
                        out.println("<option value='Negro'>Negro $60.000</option>");
                        out.println("<option value='Azul'>Azul $70.000</option>");
                        out.println("<option value='Amarillo'>Amarillo $70.000</option>");
                        out.println("</select>");
                
                
                        out.println("<h2>Marco</h2>");
                        out.println("<select id=\"marco\" name=\"marco\">");
                        out.println("<option value='XS'>XS $2'200.000</option>");
                        out.println("<option value='S'>S $2'500.000</option>");
                        out.println("<option value='M'>M $2'400.000</option>");
                        out.println("<option value='L'>L $2'520.000</option>");
                        out.println("<option value='XL'>XL $2'550.000</option>");
                        out.println("</select>");
            
                        out.println("<h2>Rueda</h2>");
                        out.println("<select id=\"rueda\" name=\"rueda\">");
                        out.println("<option value=\"DT Swiss\">DT Swiss $100.000</option>");
                        out.println("<option value=\"Mavic\">Mavic $120.000</option>");
                        out.println("<option value=\"Stan's No Tubes\">Stan's No Tubes $130.000</option>");
                        out.println("<option value=\"Industry Nine\">Industry Nine $140.000</option>");
                        out.println("<option value=\"Hope Technology\">Hope Technology $150.000</option>");
                        out.println("</select><br>");

                        out.println("<h2>Plato</h2>");
                        out.println("<select id=\"plato\" name=\"plato\">");
                        out.println("<option value=\"34-39\">34-39 $150.000</option>");
                        out.println("<option value=\"39-42\">39-42 $160.000</option>");
                        out.println("<option value=\"38-42\">38-42 $170.000</option>");
                        out.println("<option value=\"50-53\">50-53 $180.000</option>");
                        out.println("<option value=\"30-34\">30-34 $190.000</option>");
                        out.println("</select><br>");

                        out.println("<h2>Piñon</h2>");
                        out.println("<select id=\"piñon\" name=\"piñon\">");
                        out.println("<option value=\"Cassette de rango amplio\">Cassette de rango amplio $200.000</option>");
                        out.println("<option value=\"Cassette de rango estrecho\">Cassette de rango estrecho $300.000</option>");
                        out.println("</select><br>");

                        out.println("<h2>Sillin</h2>");
                        out.println("<select id=\"sillin\" name=\"sillin\">");
                        out.println("<option value=\"WTB\">WTB $80.000</option>");
                        out.println("<option value=\"SDG\">SDG $85.000</option>");
                        out.println("<option value=\"Fizik\">Fizik $90.000</option>");
                        out.println("<option value=\"Ergon\">Ergon $95.000</option>");
                        out.println("<option value=\"Fabric\">Fabric $100.000</option>");
                        out.println("</select><br>");
                        out.println("<br>");
                        out.println("<input type=\"submit\" value=\"Facturar\">");

                        out.println("</div>");
                        out.println("</form>");
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
