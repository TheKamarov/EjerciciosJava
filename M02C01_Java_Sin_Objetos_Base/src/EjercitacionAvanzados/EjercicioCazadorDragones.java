package EjercitacionAvanzados;

import java.util.Random;

/**
 * Created by digitalhouse on 12/08/16.
 */
public class EjercicioCazadorDragones {

    public static void juegoDelCazador() {

    }

    private static Boolean decidirSiGolpeaJugador() {
        Random rand = new Random();
        return rand.nextBoolean();
    }

    private static Integer decidirCuantoGolpeaJugador() {
        //El numero aleatorio que eligo será entre 0 y 4 para poder jugar más tiempo.
        Random rand = new Random();
        return rand.nextInt(5);
    }

    public static void main(String[] args){
        juegoDelCazador();
    }
}
