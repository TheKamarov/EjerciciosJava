package Ejercitacion1;

/**
 * Created by andres on 31/03/16.
 */
public class Ejercicio3 {

    Boolean menorQueElSegundo(Integer unNumeroA, Integer unNumeroB){
        //Enunciado -- Escribir el código la función para que devuelva true en caso que el numero "A"
        //              sea menor al numero "B", y false en caso contrario

        //Comenzar a escribir código acá

        if(unNumeroA < unNumeroB){
            return true;
        }else{
            return false;
        }
    }

    // No cambiar nada de aca hacia abajo
    public static void main(String[] args){
        Ejercicio3 ejercicio3 = new Ejercicio3();
        //Test 1
        System.out.println(ejercicio3.menorQueElSegundo(3,4));
        //Test 2
        System.out.println(ejercicio3.menorQueElSegundo(100,10));
        //Test 3
        System.out.println(ejercicio3.menorQueElSegundo(2,2));
    }
}

