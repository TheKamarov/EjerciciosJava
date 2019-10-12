package Ejercitacion2;

import java.util.Scanner;

/**
 * Created by andres on 31/03/16.
 */
public class Ejercicio6 {

    public Boolean contieneLaLetra(Character unaLetra, String unTexto){
        //Comenzar a escribir código acá

        for (int i = 0; i < unTexto.length(); i++){
            if(unTexto.charAt(i) == unaLetra){
                return true;
            }
        }
        return false;
    }

    //No cambiar nada de aca hacia abajo
    public static void main(String[] args){

        Ejercicio6 ejercicio6 = new Ejercicio6();
        //Test 1
        System.out.println(ejercicio6.contieneLaLetra('e', "hello world"));
        //Test 2
        System.out.println(ejercicio6.contieneLaLetra('y', "zanahoria"));
        //Test 3
        System.out.println(ejercicio6.contieneLaLetra('u', "probando mi funcion"));
    }
}









