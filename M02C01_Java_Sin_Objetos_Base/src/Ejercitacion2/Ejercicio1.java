package Ejercitacion2;

/**
 * Created by andres on 31/03/16.
 */
public class Ejercicio1 {

    public Boolean esImparMayorADiez(Integer unNumero){
        //Comenzar a escribir código acá

        int resultado = unNumero % 2;
        if(resultado != 0 && unNumero > 10){
            return true;
        }else {
            return false;
        }
    }

    //No cambiar nada de aca hacia abajo
    public static void main(String[] args){

        Ejercicio1 ejercicio1 = new Ejercicio1();
        //Test 1
        System.out.println(ejercicio1.esImparMayorADiez(1));
        //Test 2
        System.out.println(ejercicio1.esImparMayorADiez(13));
        //Test 3
        System.out.println(ejercicio1.esImparMayorADiez(15));
    }
}

