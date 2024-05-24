/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConexionBD;

import Modelo.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jhona
 */
public class DatosConexion {
    
    
    Conexion cn;
    
    public DatosConexion(){
        cn = new Conexion();
    }
    
    
    
    public boolean verificarUsuario(String email, String contraseña) {
        boolean usuarioEncontrado = false;
        try {
            PreparedStatement pstm = cn.getConexion().prepareStatement("SELECT id FROM usuario WHERE email = ? AND contraseña = ?");
            pstm.setString(1, email);
            pstm.setString(2, contraseña);
            ResultSet rs = pstm.executeQuery();
            usuarioEncontrado = rs.next(); // Si hay al menos una fila en el resultado, el usuario existe
        } catch (SQLException e) {
            System.out.println(e);
        }
        return usuarioEncontrado;
    }
        
    public ResultSet getUsuarioById(int id) throws SQLException {
        PreparedStatement pstm = cn.getConexion().prepareStatement("SELECT id, "
                + " nombre, "
                + " apellido, "
                + " compra, "
                + " venta,"
                + " email, "
                + " contraseña, "
                + " balance "
                + " FROM usuario "
                + " WHERE id = ? ");
        pstm.setInt(1, id);
        System.out.println("entro");
        ResultSet res = pstm.executeQuery();
        return res;
    }
    
    public ResultSet getUsuarios() throws SQLException {
        PreparedStatement pstm = cn.getConexion().prepareStatement("SELECT id, "
                + " nombre, "
                + " apellido, "
                + " compra, "
                + " venta,"
                + " email, "
                + " contraseña, "
                + " balance "
                + " FROM usuario "
                + " ORDER BY nombre");

        ResultSet res = pstm.executeQuery();
        return res;
    }
    
    public void insertarUsuario(Usuario c) {
        try {
            PreparedStatement pstm = cn.getConexion().prepareStatement("insert into usuario (nombre, "
                    + " apellido,"
                    + " email,"
                    + " contraseña)"
                    + " values(?,?,?,?)");
            pstm.setString(1, c.getNombre());
            pstm.setString(2, c.getApellido());
            pstm.setString(3, c.getEmail());
            pstm.setString(4, c.getContraseña());
            pstm.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
        
       public String getMensaje() {
        return cn.getMensaje();
    }

}
    

