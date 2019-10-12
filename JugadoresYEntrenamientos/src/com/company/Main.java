package com.company;

public class Main {

    public static void main(String[] args) {

        JugadorDeFutbol primerFichaje = new JugadorDeFutbol("Cristiano", 35, 80, 345, 560);
        JugadorDeFutbol segundoFichaje = new JugadorDeFutbol("Lionel", 70, 83,330, 540);

        SesionDeEntrenamiento primerEntrenamiento = new SesionDeEntrenamiento(primerFichaje, 20);
        SesionDeEntrenamiento segundoEntrenamiento = new SesionDeEntrenamiento(segundoFichaje, 30);

        primerEntrenamiento.entrenarA();
        segundoEntrenamiento.entrenarA();


    }
}
