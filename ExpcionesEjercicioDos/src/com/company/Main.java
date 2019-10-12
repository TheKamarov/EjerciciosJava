package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> listaDeCosas = new ArrayList<>();
        listaDeCosas.add("Perro");
        listaDeCosas.add("Perro");
        listaDeCosas.add("Gato");

        try {
            listaDeCosas.get(3);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
