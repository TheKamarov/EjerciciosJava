package com.company;

public class Main {

    public static void main(String[] args) {

        Persona unoPersona = new Persona("Roberto", 5555);
        Persona dosPersona = new Persona("Elber", 5555);

        System.out.println(unoPersona.equals(dosPersona));
    }
}
