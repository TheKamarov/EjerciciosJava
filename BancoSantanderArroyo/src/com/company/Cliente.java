package com.company;

public class Cliente {

    //ATRIBUTOS Visibilidad  TipoDeDato  NombreAtributo

    private String nombre;
    private String apellido;

    //Constructor
    public Cliente(String nombreDelCliente, String apellidoDelCliente){
        nombre = nombreDelCliente;
        apellido = apellidoDelCliente;
    }

    //METODOS   Visibilidad TipoDeDatoRetorno   nombreMetodo(tipoDeDato Parmetro){}

    public void modificarNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }

}
