package com.company;

public class Persona {
    private String nombre;
    private String alergia;

    public Persona(String nombre, String alergia){
        this.nombre = nombre;
        this.alergia = alergia;
    }

    public String getAlergia() {
        return alergia;
    }

    public String getNombre() {
        return nombre;
    }
}
