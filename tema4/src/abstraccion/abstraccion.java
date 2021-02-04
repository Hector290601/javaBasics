/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

/**
 *
 * @author hector
 */

public class abstraccion {
    public static void main(String[] args){
        humano hector = new humano('m', 19, (float)85, 175);
        System.out.print("objeto humano: ");
        System.out.println(hector);
        System.out.println(hector.toString());
    }
}
