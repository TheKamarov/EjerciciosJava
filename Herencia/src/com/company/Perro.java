package com.company;

import java.util.ArrayList;

public class Perro extends Animal {
    private ArrayList<String>trucos;

    public Perro(String raza, Integer edad, ArrayList<String>apodos,ArrayList<String>trucos){
        super(raza,edad,apodos);
        this.trucos = trucos;
    }

}
