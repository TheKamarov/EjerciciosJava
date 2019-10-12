package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();

        try {
            System.out.println(lista.get(2));
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
