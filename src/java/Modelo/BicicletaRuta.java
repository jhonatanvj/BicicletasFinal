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
public class BicicletaRuta extends Bicicleta{
    
    
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
        "Shimano",
        "Mavic",
        "Campagnolo",
        "Fulcrum",
        "Zipp"
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
        "11-28",
        "28-30",
        "30-32",
        "42-50",
        "45-48"
        );
    }
    
    @Override
    public void asignarSillin(){
        this.sillin=Arrays.asList(
        "Fizik",
        "Selle Italia",
        "Specialized",
        "Selle SMP",
        "Prologo"
        );
    }
    
}
