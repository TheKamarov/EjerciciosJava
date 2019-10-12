package com.company;

public class Empleado {
    private String nombre;
    private Integer numeroDeLegajo;

    public Empleado(String nombre, Integer numeroDeLegajo){
        this.nombre = nombre;
        this.numeroDeLegajo = numeroDeLegajo;
    }

    public Integer getNumeroDeLegajo() {
        return numeroDeLegajo;
    }

    public boolean equals(Object obj){
        Empleado unEmpleado = (Empleado) obj;
        return this.getNumeroDeLegajo().equals(unEmpleado.getNumeroDeLegajo());
    }
}
