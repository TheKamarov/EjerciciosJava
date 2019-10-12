package Ejercitacion1;

/**
 * Created by andres on 31/03/16.
 */
public class Ejercicio6 {


    Boolean esPar(Integer unNumero){
        //Enunciado -- Escribir la funcion para que devuelva true en caso que unNumero sea par
        //              o false en caso contrario.
        //Ayuda -- Ver operador %

        //Comenzar a escribir código acá

        int resultado = unNumero % 2;

        if(resultado == 0){
            return true;
        }else{
            return false;
        }

    }

    //No cambiar nada de aca hacia abajo
    public static void main(String[] args){
        Ejercicio6 ejercicio6 = new Ejercicio6();
        //Test 1
        System.out.println(ejercicio6.esPar(2));
        //Test 2
        System.out.println(ejercicio6.esPar(5));
        //Test 3
        System.out.println(ejercicio6.esPar(0));
    }
}

