/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.List;

/**
 *
 * @author Estudiantes
 */
public class Bicicleta {
    
    List<String> color;
    List<String> marco;
    List<String> rueda;
    List<String> plato;
    List<String> piñon;
    List<String> sillin;
    boolean freno;
    int precio;
    
    public void asignarColor(){
        this.color=null;
    }
    
    public void asignarMarco(){
        this.marco=null;
    }
    
    public void asignarRueda(){
        this.rueda=null;
    }
    
    public void asignarPlato(){
        this.plato=null;
    }
    
    public void asignarPiñon(){
        this.piñon=null;
    }
    
    public void asignarSillin(){
        this.sillin=null;
    }

    public List<String> getColor() {
        return color;
    }

    public void setColor(List<String> color) {
        this.color = color;
    }

    public List<String> getMarco() {
        return marco;
    }

    public void setMarco(List<String> marco) {
        this.marco = marco;
    }

    public List<String> getRueda() {
        return rueda;
    }

    public void setRueda(List<String> rueda) {
        this.rueda = rueda;
    }

    public List<String> getPlato() {
        return plato;
    }

    public void setPlato(List<String> plato) {
        this.plato = plato;
    }

    public List<String> getPiñon() {
        return piñon;
    }

    public void setPiñon(List<String> piñon) {
        this.piñon = piñon;
    }

    public List<String> getSillin() {
        return sillin;
    }

    public void setSillin(List<String> sillin) {
        this.sillin = sillin;
    }

    public boolean isFreno() {
        return freno;
    }

    public void setFreno(boolean freno) {
        this.freno = freno;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    

}
