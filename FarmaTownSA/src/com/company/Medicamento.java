package com.company;

import java.util.ArrayList;
import java.util.List;

public class Medicamento implements Vendible {

    private ArrayList<Vendible> listaDeVendibles = new ArrayList<>();



    @Override
    public void vender(Persona unaPersona) {
        for(int i = 0; i < listaDeVendibles.size(); i++){
            Vendible unaDroga = listaDeVendibles.get(i);
            unaDroga.vender(unaPersona);
        }
    }

    public void agregarVendible(Vendible unVendible){
        listaDeVendibles.add(unVendible);
    }

}
