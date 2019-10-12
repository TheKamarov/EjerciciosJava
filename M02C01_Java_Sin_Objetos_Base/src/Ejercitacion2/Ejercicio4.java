package Ejercitacion2;

/**
 * Created by andres on 31/03/16.
 */
public class Ejercicio4 {


    public void primerosCienNumeros(){
        //Comenzar a escribir código acá

        for(int i = 1; i < 100; i += 2){
            System.out.println(i);
        }
    }

    //No cambiar nada de aca hacia abajo
    public static void main(String[] args){
        //Test
        Ejercicio4 ejercicio4 = new Ejercicio4();
        ejercicio4.primerosCienNumeros();
    }
}