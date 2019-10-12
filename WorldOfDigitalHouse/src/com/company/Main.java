package com.company;

import com.company.MundoDeLasCriaturas.Dragon;
import com.company.mundoDeLosHeroes.Guerrero;
import com.company.mundoDeLosHeroes.Magos;

public class Main {

    public static void main(String[] args) {

        Guerrero unGuerrero = new Guerrero(11.0);
        Magos unMago = new Magos(13.0);

        Dragon unDragon = new Dragon(10.0);

        unGuerrero.lucharContraUnaCriatura(unDragon);
        unGuerrero.lucharContraUnaCriatura(unDragon);
        unMago.resucitarAUnGuerrero(unGuerrero);
        unGuerrero.lucharContraUnaCriatura(unDragon);

        unMago.lucharContraUnaCriatura(unDragon);
        unMago.lucharContraUnaCriatura(unDragon);

    }
}
