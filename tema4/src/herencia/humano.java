/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import encapsulamiento.*;

/**
 *
 * @author hector
 */
public class humano{
    public char sexo;
    protected int edad;
    private float peso;
    public int altura;
    public humano(char sexo, int edad, float peso, int altura){
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }
    public humano(){
        
    }
    @Override
    public String toString(){
        String cadena = "";
        cadena += "es un humano de sexo " + this.sexo + ", que tiene " + this.edad + " años, que pesa " + this.peso + "Kg y mide " + this.altura + "cm";
        return cadena;
    }
}
