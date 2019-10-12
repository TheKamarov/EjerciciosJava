package Ejercitacion1;

import javax.sound.midi.Soundbank;
import java.net.Inet4Address;
import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Created by andres on 31/03/16.
 */
public class Ejercicio2 {

    public static void main(String[] args){
        //Enunciado -- Declarar variables:  "unNumeroA" de tipo INTEGER
        //                                  "unNumeroB" de tipo DOUBLE
        //                                  "unaCadenaDeTexto" de tipo STRING
        //Luego, imprimir por pantalla:  el valor de cada variable
        //                               la suma de "unNumeroA" + "unNumeroB"
        //                               la diferencia entre "unNumeroA" - "unNUmeroB"

        //Comenzar a escribir código acá

        Integer unNumeroA = 2;
        Double unNumeroB = 4.0;
        String unaCadenaDeTexto = "Hola Mundo!";
        Double suma = unNumeroA + unNumeroB;
        Double resta = unNumeroA - unNumeroB;

        System.out.println(unNumeroA);
        System.out.println(unNumeroB);
        System.out.println(unaCadenaDeTexto);
        System.out.println(suma);
        System.out.println(resta);

    }
}

