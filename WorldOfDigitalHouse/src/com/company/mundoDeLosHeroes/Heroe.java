package com.company.mundoDeLosHeroes;

import com.company.MundoDeLasCriaturas.Criatura;

public abstract class Heroe {
    private Double nivelDeExperiencia;

    public Heroe(Double nivelDeExperiencia){
        this.nivelDeExperiencia = nivelDeExperiencia;
    }

    public void lucharContraUnaCriatura(Criatura unaCriatura){

    }

    public Double getNivelDeExperiencia() {
        return nivelDeExperiencia;
    }

    protected void setNivelDeExperiencia(Double nivelDeExperiencia) {
        this.nivelDeExperiencia = nivelDeExperiencia;
    }
}
