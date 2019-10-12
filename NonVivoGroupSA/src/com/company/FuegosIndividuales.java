package com.company;

public class FuegosIndividuales implements Explotables {

    private String ruido;

    public FuegosIndividuales(String ruido){
        this.ruido = ruido;
    }

    @Override
    public void explotar() {
        System.out.println(ruido);
    }

}
