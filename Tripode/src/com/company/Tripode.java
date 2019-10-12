package com.company;

public class Tripode {

    private boolean plegado;
    private Integer alturaMinima;
    private Integer alturaMaxima;
    private Integer alturaActual;

    public Tripode(boolean plegado, Integer alturaMaxima, Integer alturaMinima, Integer alturaActual){
        this.plegado = plegado;
        this.alturaMaxima = alturaMaxima;
        this.alturaMinima = alturaMinima;
        this.alturaActual = alturaActual;
    }

    public void definirAltura(Integer nuevaAltura){
        if(nuevaAltura <= alturaMaxima){
            alturaActual = nuevaAltura;
        }else{
            System.out.println("La altura que desea ingresar no cumple con las caracteristicas del Tripode");
        }
    }

    public void plegar(){
        alturaActual = alturaActual / 2;
        plegado = true;
    }
    public void desplegar(){
        alturaActual = alturaActual * 2;
        plegado = false;
    }
    public void guardar(){
        plegado = true;
        alturaActual = alturaMinima;
    }
    public void listoParaGuardar(){
        if(plegado == true && alturaActual == alturaMinima){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    public void usar(){
        plegado = false;
        alturaActual = alturaMaxima;
    }
    public void listoParaUsar(){
        if(plegado == false && alturaActual >= (alturaMaxima / 2)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }

}
