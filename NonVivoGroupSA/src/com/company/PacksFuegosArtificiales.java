package com.company;

import java.util.ArrayList;

public class PacksFuegosArtificiales implements Explotables {

    private ArrayList<Explotables>packDeFuegosArtificiales = new ArrayList<>();

    @Override
    public void explotar() {
        for(Integer i = 0; i < packDeFuegosArtificiales.size(); i++){
            Explotables unFuegoArtificial = packDeFuegosArtificiales.get(i);
            unFuegoArtificial.explotar();
        }
    }

    public void setPackDeFuegosArtificiales(Explotables unExplotable){
        packDeFuegosArtificiales.add(unExplotable);
    }
}
