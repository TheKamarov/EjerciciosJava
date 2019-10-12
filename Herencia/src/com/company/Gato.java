package com.company;

import java.util.ArrayList;
import java.util.List;

public class Gato extends Animal {
    private Integer vidas;

    public Gato(String raza, Integer edad, ArrayList<String> apodos){
        super(raza,edad,apodos);
        this.vidas = 9;
    }

    public void hacerRuido(){
        System.out.println("Miau Miau");
    }

}
