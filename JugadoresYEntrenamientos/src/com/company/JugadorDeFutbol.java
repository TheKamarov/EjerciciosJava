package com.company;

public class JugadorDeFutbol {

    //ATRIBUTOS     Visibilidad     TipoDeDato      NombreDelAtributo
    private String nombre;
    private int energia;
    private int felicidad;
    private int goles;
    private int experiencia;
    //CONSTRUCTOR
    public JugadorDeFutbol(String nombre, int energiaActual, int felicidadActual, int golesAlIngresarAlClub, int experienciaAlIngresarAlClub){
        this.nombre = nombre;
        energia = energiaActual;
        felicidad = felicidadActual;
        goles = golesAlIngresarAlClub;
        experiencia = experienciaAlIngresarAlClub;
    }

    //METODOS       Visibilidad     TipoDeDatoRetora    NombreMetodo(tipoDeDato Parametro){}
    public void hacerGol(){
        energia = energia - 5;
        felicidad = felicidad + 10;
        goles = goles + 1;
        System.out.println("GOOOOL!");
    }

    public void correr(){
        energia = energia - 10;
        System.out.println("No me dan mas las piernas");
    }

    public void modificarGoles(int nuevosGoles){
        goles = goles + nuevosGoles;
    }
    public void sumarExperiencia(int nuevaExperiencia){
        experiencia = experiencia + nuevaExperiencia;
    }
    public int mostrarExperiencia(){
        return experiencia;
    }
    public String mostrarNombre(){
        return nombre;
    }

}
