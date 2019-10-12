package com.company;

public class Atleta {

    //ATRIBUTOS Visibilidad  TipoDeDato  NombreAtributo

    private String nombre;
    private int nivel;
    private int energia;

    //Contstructor

    public Atleta(String nombre, int nivel, int energia){
        this.nombre = nombre;
        this.nivel = nivel;
        this.energia = energia;
    }

    //METODOS   Visibilidad TipoDeDatoRetorno   nombreMetodo(tipoDeDato Parmetro){}
    public int mostrarNivel(){
        return nivel;
    }
    public int mostrarEnergia(){
        return energia;
    }
    public void restarEnergia (int catidadDeEnergia){
        energia = energia - catidadDeEnergia;
    }
}
