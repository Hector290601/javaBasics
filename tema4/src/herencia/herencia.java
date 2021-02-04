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
public class herencia {
    public static void main(String[] args){
        humano hector = new humano('M', 19, (float)85, 175);
        System.out.println("Hector " + hector.toString());
        ingeniero inge = new ingeniero(hector, "Computacion");
    }
}
