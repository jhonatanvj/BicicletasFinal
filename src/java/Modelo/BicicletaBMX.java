/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.HashMap;

/**
 *
 * @author Estudiantes
 */
public class BicicletaBMX extends Bicicleta {

    @Override
    public void asignarColor(){
        this.color = new HashMap<>();
        this.color.put("Rojo", 50);
        this.color.put("Blanco", 55);
        this.color.put("Negro", 60);
        this.color.put("Azul", 50);
        this.color.put("Amarillo", 65);
    }
    
    @Override
    public void asignarMarco(){
        this.marco = new HashMap<>();
        this.marco.put("XS", 100);
        this.marco.put("S", 110);
        this.marco.put("M", 120);
        this.marco.put("L", 130);
        this.marco.put("XL", 140);
    }
    
    @Override
    public void asignarRueda(){
        this.rueda = new HashMap<>();
        this.rueda.put("Odyssey", 200);
        this.rueda.put("Shadow Conspirancy", 210);
        this.rueda.put("Primo", 220);
        this.rueda.put("Cinema", 230);
        this.rueda.put("Éclat", 240);
    }
    
    @Override
    public void asignarPlato(){
        this.plato = new HashMap<>();
        this.plato.put("Platos de una sola pieza", 80);
        this.plato.put("Platos de tres piezas", 90);
        this.plato.put("Platos estilo sprocket", 100);
    }
    
    @Override
    public void asignarPiñon(){
        this.piñon = new HashMap<>();
        this.piñon.put("Piñones Freewheel", 50);
        this.piñon.put("Piñones Cassette", 60);
    }
    
    @Override
    public void asignarSillin(){
        this.sillin = new HashMap<>();
        this.sillin.put("Fiend", 70);
        this.sillin.put("Shadow Conspirancy", 75);
        this.sillin.put("BSD", 80);
        this.sillin.put("Animal Bikes", 85);
        this.sillin.put("Cult", 90);
    }
}

