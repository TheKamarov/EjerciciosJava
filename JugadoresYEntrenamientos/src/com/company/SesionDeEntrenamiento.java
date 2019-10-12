package com.company;

class SesionDeEntrenamiento {

    //ATRIBUTOS     Visibilidad     TipoDeDato      NombreDelAtributo

    private int experienciaObtenidaEnEntrenamiento;
    private JugadorDeFutbol nombre;

    //CONSTRUCTOR

    public SesionDeEntrenamiento(JugadorDeFutbol nombreDelJugador, int experienciaObtenidaEnEntrenamiento){
        this.experienciaObtenidaEnEntrenamiento = experienciaObtenidaEnEntrenamiento;
        nombre = nombreDelJugador;
    }

    //METODOS       Visibilidad     TipoDeDatoRetora    NombreMetodo(tipoDeDato Parametro){}

    public void entrenarA(){
        System.out.println(nombre.mostrarNombre()+" tiene: " +nombre.mostrarExperiencia()+ " de experiencia");
        nombre.correr();
        nombre.hacerGol();
        nombre.correr();
        nombre.sumarExperiencia(experienciaObtenidaEnEntrenamiento);
        System.out.println("Ahora "+nombre.mostrarNombre()+" tiene: " +nombre.mostrarExperiencia()+ " de experiencia");
    }
}
