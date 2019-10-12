package com.company;

public class Main {

    public static void main(String[] args) {
	    Perro miPrimerPerro = new Perro("Jorge");
        Perro miSegundoPerro = new Perro("Mia");
        Perro miTercerPerro = new Perro("Jorgelin");


        Persona jose = new Persona("Jose", miSegundoPerro);

        jose.pasearPerro(20);
    }
}
