package com.company;

public class Drogas implements Vendible {

    private String nombre;

    public Drogas(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void vender(Persona unaPersona) {
        if(unaPersona.getAlergia().equals(this.nombre)){
            System.out.println(unaPersona.getNombre() +" no puede recibir la droga "+ this.nombre + " porque es alergico");

        }else{
            System.out.println(unaPersona.getNombre() + " puede recibir la droga " + this.nombre);
        }
    }
}
