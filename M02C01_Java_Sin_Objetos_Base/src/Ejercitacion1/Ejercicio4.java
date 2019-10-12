package Ejercitacion1;

/**
 * Created by andres on 31/03/16.
 */
public class Ejercicio4 {

    Integer maximoEntreTresNumeros(Integer unNumeroA, Integer unNumeroB, Integer unNumeroC){
        //Enunciado -- Escribir  el código funcion para que devuelva el número maximo entre tres numeros

        //Comenzar a escribir código acá

        if(unNumeroA > unNumeroB && unNumeroA > unNumeroC){
            return unNumeroA;
        }else if(unNumeroB > unNumeroC){
            return unNumeroB;
        }else{
            return unNumeroC;
        }
    }

    //No cambiar nada de aca hacia abajo
    public static void main(String[] args){
        Ejercicio4 ejercicio4 = new Ejercicio4();
        //Test 1
        System.out.println(ejercicio4.maximoEntreTresNumeros(102,45,30));
        //Test 2
        System.out.println(ejercicio4.maximoEntreTresNumeros(45,10,50));
        //Test 3
        System.out.println(ejercicio4.maximoEntreTresNumeros(11,11,11));
    }
}

