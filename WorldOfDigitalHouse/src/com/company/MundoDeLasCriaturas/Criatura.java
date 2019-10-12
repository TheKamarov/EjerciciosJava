package com.company.MundoDeLasCriaturas;

public abstract class Criatura {
    private Double nivelDeAtaque;

    public Criatura(Double nivelDeAtaque){
        this.nivelDeAtaque = nivelDeAtaque;
    }

    public Double getNivelDeAtaque() {
        return nivelDeAtaque;
    }
}
