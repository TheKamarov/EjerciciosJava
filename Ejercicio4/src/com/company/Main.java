package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<Integer>conjuntoVacio = new HashSet<>();

        conjuntoVacio.add(1);
        conjuntoVacio.add(5);
        conjuntoVacio.add(5);
        conjuntoVacio.add(6);
        conjuntoVacio.add(7);
        conjuntoVacio.add(8);
        conjuntoVacio.add(8);
        conjuntoVacio.add(8);

        System.out.println(conjuntoVacio);

    }
}
