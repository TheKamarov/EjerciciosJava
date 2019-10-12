package com.company;

import java.util.List;

public class Gato {

    private String nombre;
    private Double energia;
    private Double velocidad;

    public Gato(String nombre) {
        this.nombre = nombre;
        energia = 0.0;
        velocidad = 5.0;
    }

    public void comerRaton(Raton unRaton){
        energia = energia + unRaton.getPeso();
        System.out.println("me comi un raton mi nueva energia es " + energia);
    }

    public void comerRaton(List<Raton> ratones){
        for (Raton unRaton:ratones) {
            comerRaton(unRaton);
        }
    }

    public Double correr(Integer metros){
        energia = energia - energiaConsumida(metros);
        return metros/velocidad;
    }

    public Boolean meConvieneComerA(Raton unRaton, Integer unaDistancia){
        return unRaton.getPeso() > energiaConsumida(unaDistancia);
    }

    private Double energiaConsumida(Integer metros){
        return 0.5*metros;
    }




}
