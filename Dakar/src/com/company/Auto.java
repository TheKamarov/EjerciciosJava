package com.company;

// vamos a hacer que nuestro auto HEREDE de vehiculo
public class Auto extends Vehiculo {

    // constructor
    public Auto(Double velocidad, Double aceleracion, Double anguloDeGiro, String patente) {
        // uso el constructor del padre pero le paso valores fijos a peso y cantidad de ruedas
        super(velocidad, aceleracion, anguloDeGiro, patente, 1000.0, 4);
    }

    //creo otro constructor que si pueda modificar el peso del auto (Overloading)
/*
    public Auto(Double velocidad, Double aceleracion, Double anguloDeGiro, String patente, Double peso) {
        super(velocidad, aceleracion, anguloDeGiro, patente, peso, 4);
    }*/
}
