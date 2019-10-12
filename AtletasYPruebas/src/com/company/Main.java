package com.company;

public class Main {

    public static void main(String[] args) {

        Atleta primerAtleta = new Atleta("Eduard", 25, 85);
        Atleta segundoAtleta = new Atleta("Robert", 10, 100);

        Prueba primerPrueba = new Prueba(25, 5, primerAtleta);
        Prueba segundaPrueba = new Prueba(26, 35, primerAtleta);
        Prueba terceraPrueba = new Prueba(10, 15, primerAtleta);
        Prueba cuartaPrueba = new Prueba(5, 5, segundoAtleta);
        Prueba quintaPrueba = new Prueba(24, 50, segundoAtleta);
        Prueba sextaPrueba = new Prueba(1, 25, segundoAtleta);

        primerPrueba.puedeRealizar();
        segundaPrueba.puedeRealizar();
        terceraPrueba.puedeRealizar();
        cuartaPrueba.puedeRealizar();
        quintaPrueba.puedeRealizar();
        sextaPrueba.puedeRealizar();
    }
}
