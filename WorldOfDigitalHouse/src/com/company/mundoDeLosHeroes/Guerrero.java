package com.company.mundoDeLosHeroes;

import com.company.MundoDeLasCriaturas.Criatura;

public class Guerrero extends Heroe {
    private Double nivelDeVida;

    public Guerrero(Double nivelDeExperiencia) {
        super(nivelDeExperiencia);
        this.nivelDeVida = 100.0;
    }

    protected void setNivelDeVida(Double nivelDeVida) {
        this.nivelDeVida = nivelDeVida;
    }

    public Double getNivelDeVida() {
        return nivelDeVida;
    }

    @Override
    public void lucharContraUnaCriatura(Criatura unaCriatura) {
       if(this.nivelDeVida == 0.0){
           System.out.println("El guerrero no puede luchar y debera esperar su resurreccion");
       }else if (unaCriatura.getNivelDeAtaque() < this.getNivelDeExperiencia()) {
           setNivelDeExperiencia(getNivelDeExperiencia() + 1);
           System.out.println("El guerrero gano!");
       }else{
           this.nivelDeVida = 0.0;
           System.out.println("El guerrero perdio y se quedo sin vida");
       }
    }
}
