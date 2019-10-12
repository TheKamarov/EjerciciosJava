package Ejercitacion2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by andres on 31/03/16.
 */
public class Ejercicio3 {

    public Double promedio(ArrayList<Integer> unArrayDeEnteros){
        //Comenzar a escribir código acá

        Double acumulador = 0.0;
        for (int i = 0; i < unArrayDeEnteros.size(); i++){
            acumulador = acumulador + unArrayDeEnteros.get(i);
        }
        return acumulador / unArrayDeEnteros.size();
    }

    //No cambiar nada de aca hacia abajo
    public static void main(String[] args){
        Ejercicio3 ejercicio3 = new Ejercicio3();
        //Test 1
        ArrayList<Integer> prueba = new ArrayList<Integer>();
        prueba.add(1);
        prueba.add(2);
        prueba.add(3);
        System.out.println(ejercicio3.promedio(prueba));

        //Test 2
        ArrayList<Integer> prueba2 = new ArrayList<Integer>();
        prueba2.add(2);
        prueba2.add(4);
        prueba2.add(3);
        prueba2.add(7);
        System.out.println(ejercicio3.promedio(prueba2));

        //Test 3
        ArrayList<Integer> prueba3 = new ArrayList<Integer>();
        prueba3.add(2);
        prueba3.add(2);
        prueba3.add(2);
        prueba3.add(2);
        System.out.println(ejercicio3.promedio(prueba3));
    }
}

