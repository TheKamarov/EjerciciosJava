package Ejercitacion3;

import java.util.ArrayList;

/**
 * Created by digitalhouse on 22/08/16.
 */
public class Ejercicio1 {

    Integer totalArray(ArrayList<Integer> unArrayList){

        //Retornar la suma de todos los elementos de un array

        int acumulador = 0;
        for(int i = 0; i < unArrayList.size(); i++){
            acumulador = acumulador + unArrayList.get(i);
        }

        return acumulador;
    }

    //No cambiar nada de aca hacia abajo
    public static void main(String[] args){

        Ejercicio1 ejercicio1 = new Ejercicio1();

        //Test 1
        ArrayList<Integer> array1 = new ArrayList<>();
        array1.add(1);
        array1.add(2);
        array1.add(3);
        array1.add(4);

        System.out.println(ejercicio1.totalArray(array1));

        //Test 2
        ArrayList<Integer> array2 = new ArrayList<>();
        array2.add(1);
        array2.add(0);
        array2.add(103);

        System.out.println(ejercicio1.totalArray(array2));

        //Test 3
        ArrayList<Integer> array3 = new ArrayList<>();
        array3.add(-1);
        array3.add(-2);
        array3.add(3);
        array3.add(0);

        System.out.println(ejercicio1.totalArray(array3));
    }

}
