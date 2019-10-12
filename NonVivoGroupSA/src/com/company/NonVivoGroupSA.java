package com.company;

import java.util.ArrayList;

public class NonVivoGroupSA {

    private ArrayList<Invitados>listaDeInvitados = new ArrayList<>();
    private ArrayList<Explotables>listaDeExplotables = new ArrayList<>();
    private Integer cantidadDeFuegosArtificiales = listaDeExplotables.size();

    public void encender(){
        for(Integer i =0; i<listaDeExplotables.size(); i++){
            Explotables unFuegoArtificial = listaDeExplotables.get(i);
            unFuegoArtificial.explotar();
        }
        for(Integer i = 0; i<listaDeInvitados.size();i++){
            Invitados unInvitado = (listaDeInvitados.get(i));
            unInvitado.comer();
        }
    }

    public void agregarInvitados(Invitados unInvitado){
        listaDeInvitados.add(unInvitado);
    }
    public void agregarExplotables(Explotables unExplotable){
        listaDeExplotables.add(unExplotable);
    }
}
