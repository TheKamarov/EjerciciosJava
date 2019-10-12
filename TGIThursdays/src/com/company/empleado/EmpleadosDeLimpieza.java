package com.company.empleado;

public abstract class EmpleadosDeLimpieza {

    private String nombre;
    private String apellido;
    private Integer sueldo;

    public EmpleadosDeLimpieza(String nombre, String apellido, Integer sueldo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
    }

    public Integer getSueldo(){
        return sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public Integer cobrarSueldo(){
        return sueldo;
    }
}
