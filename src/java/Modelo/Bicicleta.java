/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Map;

/**
 *
 * @author Estudiantes
 */
public class Bicicleta {

    Map<String, Integer> color;
    Map<String, Integer> marco;
    Map<String, Integer> rueda;
    Map<String, Integer> plato;
    Map<String, Integer> piñon;
    Map<String, Integer> sillin;
    boolean freno;
    int precio;
    
    public void asignarColor(){
        this.color = null;
    }
    
    public void asignarMarco(){
        this.marco = null;
    }
    
    public void asignarRueda(){
        this.rueda = null;
    }
    
    public void asignarPlato(){
        this.plato = null;
    }
    
    public void asignarPiñon(){
        this.piñon = null;
    }
    
    public void asignarSillin(){
        this.sillin = null;
    }

    public Map<String, Integer> getColor() {
        return color;
    }

    public void setColor(Map<String, Integer> color) {
        this.color = color;
    }

    public Map<String, Integer> getMarco() {
        return marco;
    }

    public void setMarco(Map<String, Integer> marco) {
        this.marco = marco;
    }

    public Map<String, Integer> getRueda() {
        return rueda;
    }

    public void setRueda(Map<String, Integer> rueda) {
        this.rueda = rueda;
    }

    public Map<String, Integer> getPlato() {
        return plato;
    }

    public void setPlato(Map<String, Integer> plato) {
        this.plato = plato;
    }

    public Map<String, Integer> getPiñon() {
        return piñon;
    }

    public void setPiñon(Map<String, Integer> piñon) {
        this.piñon = piñon;
    }

    public Map<String, Integer> getSillin() {
        return sillin;
    }

    public void setSillin(Map<String, Integer> sillin) {
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

