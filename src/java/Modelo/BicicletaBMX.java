/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Arrays;

/**
 *
 * @author Estudiantes
 */
public class BicicletaBMX extends Bicicleta{
    
    @Override
    public void asignarColor(){
        this.color=Arrays.asList(
        "Rojo",
        "Blanco",
        "Negro",
        "Azul",
        "Amarillo"
        );
    }
    
    @Override
    public void asignarMarco(){
        this.marco=Arrays.asList(
        "XS",
        "S",
        "M",
        "L",
        "XL"
        );
    }
    
    @Override
    public void asignarRueda(){
        this.rueda=Arrays.asList(
        "Odyssey",
        "Shadow Conspirancy",
        "Primo",
        "Cinema",
        "Éclat"
        );
    }
    
    @Override
    public void asignarPlato(){
        this.plato=Arrays.asList(
        "Platos de una sola pieza",
        "Platos de tres piezas",
        "Platos estilo sprocket"
        );
    }
    
    @Override
    public void asignarPiñon(){
        this.piñon=Arrays.asList(
        "Piñones Freewheel",
        "Piñones Cassette"
        );
    }
    
    @Override
    public void asignarSillin(){
        this.sillin=Arrays.asList(
        "Fiend",
        "Shadow Conspirancy",
        "BSD",
        "Animal Bikes",
        "Cult"
        );
    
}
    
}
