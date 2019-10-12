package com.company;

public class Vehiculos {

    //ATRIBUTOS Visibilidad  TipoDeDato  NombreAtributo

    private String marca;
    private String modelo;
    private int anoDeFabricacion;
    private String color;
    private double kilometraje;

    //Contstructor

    public Vehiculos(String marca, String modelo, int anoDeFabricacion, String color, double kilometraje){
        this.marca = marca;
        this.modelo = modelo;
        this.anoDeFabricacion = anoDeFabricacion;
        this.color = color;
        this.kilometraje = kilometraje;
    }

    //METODOS   Visibilidad TipoDeDatoRetorno   nombreMetodo(tipoDeDato Parmetro){}

    public String mostrarVehiculo(){
        return marca + " " + modelo;
    }
}
