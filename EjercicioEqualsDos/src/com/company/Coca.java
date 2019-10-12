package com.company;

public class Coca {
    private Integer tamano;
    private Double precio;

    public Coca (Integer tamano, Double precio){
        this.tamano = tamano;
        this.precio = precio;
    }

    public Integer getTamano() {
        return tamano;
    }

    public boolean equals(Object obj){
        Coca unoCoca = (Coca) obj;
        return this.getTamano().equals(unoCoca.getTamano());
    }
}
