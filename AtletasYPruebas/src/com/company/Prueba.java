package com.company;

public class Prueba {

    //ATRIBUTOS Visibilidad  TipoDeDato  NombreAtributo

    private int dificultadRequerida;
    private int energiaRequerida;
    private Atleta nombre;

    //Contstructor

    public Prueba(int dificultadRequerida, int energiaRequerida, Atleta nombreDelAtleta){
        this.dificultadRequerida = dificultadRequerida;
        this.energiaRequerida = energiaRequerida;
        this.nombre = nombreDelAtleta;
    }

    //METODOS   Visibilidad TipoDeDatoRetorno   nombreMetodo(tipoDeDato Parmetro){}
    public void puedeRealizar(){
        if(nombre.mostrarNivel() >= dificultadRequerida && nombre.mostrarEnergia() >= energiaRequerida){
            nombre.restarEnergia(energiaRequerida);
            System.out.println("True");
        }else{
            System.out.println("false");
        }
    }
    public int mostrarEnergiaRequerida(){
        return energiaRequerida;
    }
}
