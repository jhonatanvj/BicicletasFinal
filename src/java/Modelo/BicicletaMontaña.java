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
public class BicicletaMontaña extends Bicicleta {
    
    @Override
    public void asignarColor() {
        this.color = new HashMap<>();
        this.color.put("Rojo", 60);
        this.color.put("Blanco", 65);
        this.color.put("Negro", 70);
        this.color.put("Azul", 75);
        this.color.put("Amarillo", 80);
    }
    
    @Override
    public void asignarMarco() {
        this.marco = new HashMap<>();
        this.marco.put("XS", 200);
        this.marco.put("S", 210);
        this.marco.put("M", 220);
        this.marco.put("L", 230);
        this.marco.put("XL", 240);
    }
    
    @Override
    public void asignarRueda() {
        this.rueda = new HashMap<>();
        this.rueda.put("DT Swiss", 300);
        this.rueda.put("Mavic", 310);
        this.rueda.put("Stan's No Tubes", 320);
        this.rueda.put("Industry Nine", 330);
        this.rueda.put("Hope Technology", 340);
    }
    
    @Override
    public void asignarPlato() {
        this.plato = new HashMap<>();
        this.plato.put("34-39", 120);
        this.plato.put("39-42", 130);
        this.plato.put("38-42", 140);
        this.plato.put("50-53", 150);
        this.plato.put("30-34", 110);
    }
    
    @Override
    public void asignarPiñon() {
        this.piñon = new HashMap<>();
        this.piñon.put("Cassette de rango amplio", 100);
        this.piñon.put("Cassette de rango estrecho", 90);
    }
    
    @Override
    public void asignarSillin() {
        this.sillin = new HashMap<>();
        this.sillin.put("WTB", 80);
        this.sillin.put("SDG", 85);
        this.sillin.put("Fizik", 90);
        this.sillin.put("Ergon", 95);
        this.sillin.put("Fabric", 100);
    }
}
