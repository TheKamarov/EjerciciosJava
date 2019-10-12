package Ejercitacion3;

import java.util.ArrayList;

/**
 * Created by digitalhouse on 22/08/16.
 */
public class Ejercicio3 {

    ArrayList<Integer> soloLosParesArray(ArrayList<Integer> unArrayList) {

        //Retornar un ArrayList con todos los elementos pares de un array.
        ArrayList<Integer> arrayFinal = new ArrayList<Integer>();

        for(int i = 0; i < unArrayList.size(); i++){
            int resto = unArrayList.get(i) % 2;
            if(resto == 0){
                arrayFinal.add(unArrayList.get(i));
            }
        }
        return arrayFinal;
    }

    //No cambiar nada de aca hacia abajo
    public static void main(String[] args){

        Ejercicio3 ejercicio3 = new Ejercicio3();

        //Test 1
        ArrayList<Integer> array1 = new ArrayList<>();
        array1.add(1);
        array1.add(2);
        array1.add(4);
        array1.add(7);

        System.out.println(ejercicio3.soloLosParesArray(array1));

        //Test 2
        ArrayList<Integer> array2 = new ArrayList<>();
        array2.add(1);
        array2.add(1);
        array2.add(103);

        System.out.println(ejercicio3.soloLosParesArray(array2));

        //Test 3
        ArrayList<Integer> array3 = new ArrayList<>();
        array3.add(-1);
        array3.add(-2);
        array3.add(14);
        array3.add(0);

        System.out.println(ejercicio3.soloLosParesArray(array3));

    }
}
