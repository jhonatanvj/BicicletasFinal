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
public class BicicletaMontaña extends Bicicleta{
    
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
        "DT Swiss",
        "Mavic",
        "Stan's No Tubes",
        "Industry Nine",
        "Hope Technology"
        );
    }
    
    @Override
    public void asignarPlato(){
        this.plato=Arrays.asList(
        "34-39",
        "39-42",
        "38-42",
        "50-53",
        "30-34"
        );
    }
    
    @Override
    public void asignarPiñon(){
        this.piñon=Arrays.asList(
        "Cassette de rango amplio",
        "Cassette de rango estrecho"
        );
    }
    
    @Override
    public void asignarSillin(){
        this.sillin=Arrays.asList(
        "WTB",
        "SDG",
        "Fizik",
        "Ergon",
        "Fabric"
        );
    }
}
