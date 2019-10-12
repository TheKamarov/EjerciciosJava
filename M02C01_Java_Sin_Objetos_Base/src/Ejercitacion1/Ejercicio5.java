package Ejercitacion1;

/**
 * Created by andres on 31/03/16.
 */
public class Ejercicio5 {

    Boolean cadenasDeTextoDistintas(String textoA, String textoB){
        //Enunciado -- Escribir la funcion para que devuelva true en caso que "textoA" y "textoB" sean
        //              distintos, y false en caso que sean iguales
        //Ayuda -- Ver operador !

        //Comenzar a escribir código acá

        if(textoA == textoB){
            return true;
        }else{
            return false;
        }
    }

    //No cambiar nada de aca hacia abajo
    public static void main(String[] args){
        Ejercicio5 ejercicio5 = new Ejercicio5();
        //Test 1
        System.out.println(ejercicio5.cadenasDeTextoDistintas("digital", "digital"));
        //Test 2
        System.out.println(ejercicio5.cadenasDeTextoDistintas("mobile", "android"));
    }
}

