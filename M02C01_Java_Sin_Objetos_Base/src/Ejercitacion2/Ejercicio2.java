package Ejercitacion2;

/**
 * Created by andres on 31/03/16.
 */
public class Ejercicio2 {

    public Boolean algunoMayor(Integer numA, Integer numB, Integer numC, Integer numD) {
        //Comenzar a escribir código acá
        if(numA > numC && numA > numD || numB > numC && numB > numD){
            return true;
        }else{
            return false;
        }
    }

    //No cambiar nada de aca hacia abajo
    public static void main(String[] args){

        Ejercicio2 ejercicio2 = new Ejercicio2();
        //Test 1
        System.out.println(ejercicio2.algunoMayor(1,3,5,4));
        //Test 2
        System.out.println(ejercicio2.algunoMayor(3,6,1,2));
        //Test 3
        System.out.println(ejercicio2.algunoMayor(2,4,6,3));
    }
}

