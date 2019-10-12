package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer>listaNueva = new ArrayList<>();

        for(int i = 1; i <= 100; i++){
            listaNueva.add(i);
        }

        System.out.println(listaNueva);
    }
}
