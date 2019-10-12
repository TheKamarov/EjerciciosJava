package com.company;

import java.util.List;

public class Prueba {

    public void imprimirPorPantalla(List<String> nombres){
        for(int i=0; i < nombres.size(); i++){
            System.out.println("El nombre del alumno es: " + nombres.get(i));
        }
    }

}
