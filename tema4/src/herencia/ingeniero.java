/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author hector
 */
public class ingeniero extends humano {
    public String carrera;
    public ingeniero(humano inge, String carrera){
        super.altura = inge.altura;
        super.edad = inge.edad;
        super.sexo = inge.sexo;
        this.carrera = carrera;
    }
    @Override
    public String toString(){
        String cadena = "";
        cadena += "es un ingneniero en " + this.carrera + " de sexo " + super.sexo + ", que tiene " + super.edad + " años y mide " + super.altura + "cm";
        return cadena;
    }
}
