package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Gato tom = new Gato("Tom");

        Raton jerry = new Raton("Jerry",4.4);

        List<Raton> listaRatones = new ArrayList<>();
        for (int i = 0; i < 10 ; i++) {
            listaRatones.add(new Raton("Mikey",4.0));
        }


        tom.comerRaton(jerry);
        tom.comerRaton(listaRatones);


    }
}
