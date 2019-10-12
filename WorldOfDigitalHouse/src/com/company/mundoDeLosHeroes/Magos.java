package com.company.mundoDeLosHeroes;

import com.company.MundoDeLasCriaturas.Criatura;

public class Magos extends Heroe {

    public Magos(Double nivelDeExperiencia) {
        super(nivelDeExperiencia);
    }

    public void resucitarAUnGuerrero(Guerrero unGuerrero){
        if(unGuerrero.getNivelDeExperiencia() <= this.getNivelDeExperiencia()){
            unGuerrero.setNivelDeVida(100.0);
            System.out.println("El Mago a resucitado al Guerrero");
        }
    }

    @Override
    public void lucharContraUnaCriatura(Criatura unaCriatura) {
        if(unaCriatura.getNivelDeAtaque() < this.getNivelDeExperiencia()){
            this.setNivelDeExperiencia(getNivelDeExperiencia() + 2);
            System.out.println("El mago gano!");
        }else{
            this.setNivelDeExperiencia(getNivelDeExperiencia() - 1);
            System.out.println("El mago perdio!");
        }
    }
}
