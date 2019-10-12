package com.company;

public class Perro {


    //ATRIBUTOS Visibilidad  TipoDeDato  NombreAtributo
    private String nombre;
    private Integer energia;

    //Constructor

    public Perro(String nombreDelPerro){
        nombre = nombreDelPerro;
        energia = 100;
    }

    //METODOS   Visibilidad TipoDeDatoRetorno   nombreMetodo(tipoDeDato Parmetro){}
    public void caminar(){
        if(energia >= 10){
            energia = energia  - 5;
        }else{
            ladrar();
        }
    }
    public void ladrar(){
        System.out.println("GUAU, GUAU!");
    }

    //Getters Y Setters

    public String obtenerNombre(){
        return nombre;
    }

    public void modificarNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }

}
