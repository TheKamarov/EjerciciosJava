package Ejercitacion3;

import java.util.ArrayList;

/**
 * Created by digitalhouse on 22/08/16.
 */
public class Ejercicio5 {

    ArrayList<Integer> listaDeNumerosEntre(Integer minimo, Integer maximo) {

        // Retornar un ArrayList con los valores dentro del intervalo de los enteros que vienen como parámetro.

        ArrayList<Integer> arrayIntervalo = new ArrayList<>();

        for(int i = minimo; i <= maximo; i++){
            arrayIntervalo.add(i);
        }

        return arrayIntervalo;
    }

    //No cambiar nada de aca hacia abajo
    public static void main(String[] args){

        Ejercicio5 ejercicio5 = new Ejercicio5();

        ejercicio5.imprimirArrayList(ejercicio5.listaDeNumerosEntre(5,10));
        ejercicio5.imprimirArrayList(ejercicio5.listaDeNumerosEntre(-4,3));
        ejercicio5.imprimirArrayList(ejercicio5.listaDeNumerosEntre(7,9));

    }

    public void imprimirArrayList(ArrayList<Integer> arrayList){

        for (Integer i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println("________________________");
    }

}
