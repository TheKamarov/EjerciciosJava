package com.company;

import java.util.ArrayList;

public class Animal {
    //Atributos
    private String raza;
    private Integer edad;
    private ArrayList<String> apodos;

    public Animal(String raza, Integer edad, ArrayList<String> apodos) {
        this.raza = raza;
        this.edad = edad;
        this.apodos = apodos;
    }

    public Animal(String raza, ArrayList<String> apodos) {
        this.raza = raza;
        this.apodos = apodos;
        this.edad = 0;
    }

    public void hacerRuido(){
        System.out.println("Soy un animal");
    }

    //Metodos
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public ArrayList<String> getApodos() {
        return apodos;
    }

    public void setApodos(ArrayList<String> apodos) {
        this.apodos = apodos;
    }
}