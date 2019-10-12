package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String>listaDeAlumnos = new ArrayList<>();
        Prueba unaPrueba = new Prueba();

        listaDeAlumnos.add("Robert");
        listaDeAlumnos.add("Albert");
        listaDeAlumnos.add("Eduard");
        listaDeAlumnos.add("Michel");

        unaPrueba.imprimirPorPantalla(listaDeAlumnos);
    }
}
