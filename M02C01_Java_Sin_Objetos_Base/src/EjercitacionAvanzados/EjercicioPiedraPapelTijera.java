package EjercitacionAvanzados;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by digitalhouse on 11/08/16.
 */
public class EjercicioPiedraPapelTijera {

    public static String jugarAlPiedraPapelOTijera(String eleccion){
        //Comenzar a escribir código acá

        /*Declaro variables que sean las posibles elecciones del usuario. Y tambien una variable de tipo int que
        contenga la eleccion final del usuario*/
        int piedra = 0, tijera = 1, papel = 2, eleccionDelUsuario = 0;

        //Codigo para generar numeros aleatorios entre 0 y 2.
        Random random = new Random();
        int eleccionDeComputadora = random.nextInt(3);

        /*Creo una estructura if que meta el valor a la variable final(eleccionDelUsuario) para que se sepa que eligio.
         Lo hago con el metodo .equals ya que el que compara dos variables de tipo String*/
        /*No creo una opcion para la gente que se equivoca poniendo por ejemplo "tigera"(xd) porque sus probabilidades
        de ganar no cambiar ya que es un juego de azar y lo unico que cambian son los nombres no la posibilidades de
        ser ganador*/
        /*si el usuario pone algo distinto a "tijera" o "papel" esta dando por entendido que puso "piedra"*/
        if(eleccion.equals("tijera")){
            eleccionDelUsuario = 1;
        }else if(eleccion.equals("papel")){
            eleccionDelUsuario = 2;
        }

        /*Creo la ultima estructura if que es la que va a decidir quien es el ganador o el perdedor o si hay un empate.
          la fase busca un empate preguntandose si las elecciones que tomaron son iguales , Y es asi esta devulve un
          return de tipo String que dice "empate".
          la fase 2 busca todas las posibilidades de victoria ya que en la anterior fase descarto todas las
          posibilidades de empate, Y si la encuentra devuelve un return de tipo String diciendo "ganador".
          la fase 3 lo unico que hace es devolver el resultado "perdedor" con un return ya que las otras dos
          posibilidades fueron descartadas y la unica que queda es la derrota*/
        if(eleccionDelUsuario == eleccionDeComputadora){
            return "Empate";
        }else if(eleccionDelUsuario == 0 && eleccionDeComputadora == 1 ||
                 eleccionDelUsuario == 1 && eleccionDeComputadora == 2 ||
                 eleccionDelUsuario == 2 && eleccionDeComputadora == 0 ){
            return "ganador";
        }else{
            return "perdedor";
        }
    }

    //No cambiar nada de aca hacia abajo
    public static void main(String[] args){
        //Codigo para ingreso de nombre por teclado
        System.out.println ("Nombre del jugador:");
        String nombre = "";
        Scanner scan = new Scanner(System.in);
        nombre = scan.nextLine();

        //Codigo para ingreso de elección poandresr teclado
        System.out.println ("Elección del jugador:");
        String eleccion = "";
        eleccion = scan.nextLine();

        System.out.println("El jugador " + nombre + " resultó " + jugarAlPiedraPapelOTijera(eleccion));
    }
}