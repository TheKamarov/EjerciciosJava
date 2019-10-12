package com.company;

public class Cliente {

    //ATRIBUTOS Visibilidad  TipoDeDato  NombreAtributo

    private String nombre;
    private String apellido;
    private String contacto;

    //Contstructor

    public Cliente(String nombre, String apellido, String contacto){
        this.nombre = nombre;
        this.apellido = apellido;
        this.contacto = contacto;
    }

    //METODOS   Visibilidad TipoDeDatoRetorno   nombreMetodo(tipoDeDato Parmetro){}
    public String mostrarCliente(){
        return nombre + " " +apellido + " " + contacto;
    }
}
