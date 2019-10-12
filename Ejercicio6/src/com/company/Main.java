package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<Integer>conjuntoDeNumeros = new HashSet<>();

        for(int i = 0; i < 100; i++){
            conjuntoDeNumeros.add(1);
        }

        System.out.println(conjuntoDeNumeros);
    }
}
