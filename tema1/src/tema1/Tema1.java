/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema1;

/**
 *
 * @author hector
 */
public class Tema1 {
    /*
    (modificadores) tipoDeDatoDeRetorno nombre(args){
        cuerpo
    }
    */
    /**
     * @param args the command line arguments
     */
    
    /*
    (modificadores) tipoDeDatoDeRetorno nombre(args){
        cuerpo
    }
    */
    
    static int suma(int a, int b){
        int c = 0;
        c = a + b;
        return c;
    }
    
    static int resta(int num, int valor2){
        int restultado = 0;
        restultado = num - valor2;
        return restultado;
    }
    
    static int multiplicacion(int numero1, int numero2){
        int respuesta = 0;
        respuesta = numero1 * numero2;
        return respuesta;
    }
    
    static float division(int numero1, int numero2){
        float respuesta = 0;
        /*
        cast o castear o casteo:
        convertir de un tipo de dato a otro
        int -> float
        int -> char
        int num = 1
        (float) num = 1.0
        (char) num = '1'
        (char) ((float) num) = '1'
        String (float) num  = '1.0'
        */
        if(numero2 != 0 && !(numero1 < numero2 )){
            respuesta = (float) numero1 / (float) numero2;
        }else{
            return 404;
        }
        return respuesta;
    }
    
    /*
    Hacer un programa que regrese el cuadrado de un número dado
    */
    
    static int cuadrado(int num){
        int sqr = 0;
        sqr = num * num;
        return sqr;
    }
    
    /*
    Caclular el sueldo de un trabajador
    obtener el numero de horas y el costo por hora
    multiplicar las horas por el costo
    regresar la multiplicación
    */
    
    static int paga(int costoPorHora, int horas){
        int sueldo = 0;
        sueldo = horas * costoPorHora;
        return sueldo;
    }
    
    static boolean aumento(int anios){
        /*
        if(condicionBooleana){
            cuerpo
        }(else if(condición booleana)){
            cuerpo
        }(else{
            cuerpo
        }
        */
        /*
        if(anios >= 5){
            return true;
        }else{
            return false;
        }
        */
        boolean desicion = false;
        if(anios >= 5){
            desicion = true;
        }
        return desicion;
    }
    
    /*
    entrada:
        letra del abecedario
    salida:
        el número de letra que es esta
    */
    
    static int abecedario(char letra){
        int numero = 0;
        if(letra == 'a' || letra == 'A'){
            numero = 1;
        }else if(letra == 'e' || letra == 'E'){
            numero = 2;
        }else if(letra == 'i' || letra == 'I'){
            numero = 3;
        }else if(letra == 'o' || letra == 'O'){
            numero = 4;
        }else if(letra == 'u' || letra == 'U'){
            numero = 5;
        }else{
            numero = -1;
        }
        return numero;
    }
    
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        /*
        int a = 0;
        int b = 0;
        int a = 0, b = 0;
        */
        /*
        int a = 10, b = 15, c;
        System.out.println("Suma de a y b:");
        System.out.println(suma(a, b));
        System.out.println("Resta de a y b:");
        System.out.println(resta(a, b));
        System.out.println("multiplicacion de a y b:");
        System.out.println(multiplicacion(a, b));
        System.out.println("division de a y b:");
        System.out.println(division(a, b));
        System.out.println("a*a:");
        System.out.println(cuadrado(a));
        char d, e, f;
        double j, k, l;
        float m, n, o;
        boolean p, q, r;
        System.out.print("Su paga es: $");
        System.out.println(paga(100, 20));
        System.out.print("Su paga es: $");
        System.out.println(paga(200, 20));
        System.out.print("El cálculo del aumento del trabajador nos dio: ");
        System.out.println(aumento(40));
        System.out.println("division de a y b:");
        System.out.println(division(3, 2));
*/
        System.out.println(abecedario('U'));
    }
}
