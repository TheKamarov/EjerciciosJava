package com.company;

public class Main {

    public static void main(String[] args) {
        Gato unGato = new Gato("siames", 1, null);
        Perro unPerro = new Perro("Bull dog",1,null,null);

        unGato.hacerRuido();
        unPerro.hacerRuido();

    }
}
