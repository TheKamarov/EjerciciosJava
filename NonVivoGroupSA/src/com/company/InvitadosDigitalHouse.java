package com.company;

public class InvitadosDigitalHouse extends Invitados{

    public InvitadosDigitalHouse(String nombre, Integer dni){
        setNombre(nombre);
        setDni(dni);
    }

    @Override
    public void comer(){
        System.out.println("Viva la chiqui!!");
    }
}
