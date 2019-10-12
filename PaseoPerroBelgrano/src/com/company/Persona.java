package com.company;

public class Persona {  //UpperCamelCase

    //ATRIBUTOS Visibilidad  TipoDeDato  NombreAtributo

    private String nombre;
    private Perro unPerro; //lowerCamelCase

    public Persona(String nombre, Perro unPerro){
        this.nombre = nombre;
        this.unPerro = unPerro;
    }

    //METODOS   Visibilidad TipoDeDatoRetorno   nombreMetodo(tipoDeDato Parmetro){}

    public void pasearPerro(Integer cuadras){
        for(int i = 1; i <= cuadras; i++){
            unPerro.caminar();
            System.out.println("Caminamos " +i+ " cuadras.");
        }
    }
}

