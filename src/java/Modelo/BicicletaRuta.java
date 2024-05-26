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
public class BicicletaRuta extends Bicicleta {
    
    @Override
    public void asignarColor() {
        this.color = new HashMap<>();
        this.color.put("Rojo", 70);
        this.color.put("Blanco", 75);
        this.color.put("Negro", 80);
        this.color.put("Azul", 85);
        this.color.put("Amarillo", 90);
    }
    
    @Override
    public void asignarMarco() {
        this.marco = new HashMap<>();
        this.marco.put("XS", 220);
        this.marco.put("S", 230);
        this.marco.put("M", 240);
        this.marco.put("L", 250);
        this.marco.put("XL", 260);
    }
    
    @Override
    public void asignarRueda() {
        this.rueda = new HashMap<>();
        this.rueda.put("Shimano", 320);
        this.rueda.put("Mavic", 330);
        this.rueda.put("Campagnolo", 340);
        this.rueda.put("Fulcrum", 350);
        this.rueda.put("Zipp", 360);
    }
    
    @Override
    public void asignarPlato() {
        this.plato = new HashMap<>();
        this.plato.put("34-39", 130);
        this.plato.put("39-42", 140);
        this.plato.put("38-42", 150);
        this.plato.put("50-53", 160);
        this.plato.put("30-34", 120);
    }
    
    @Override
    public void asignarPiñon() {
        this.piñon = new HashMap<>();
        this.piñon.put("11-28", 110);
        this.piñon.put("28-30", 115);
        this.piñon.put("30-32", 120);
        this.piñon.put("42-50", 130);
        this.piñon.put("45-48", 140);
    }
    
    @Override
    public void asignarSillin() {
        this.sillin = new HashMap<>();
        this.sillin.put("Fizik", 100);
        this.sillin.put("Selle Italia", 105);
        this.sillin.put("Specialized", 110);
        this.sillin.put("Selle SMP", 115);
        this.sillin.put("Prologo", 120);
    }
}