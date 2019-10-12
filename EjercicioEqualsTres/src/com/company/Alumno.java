package com.company;

public class Alumno {
    private String nombre;
    private Integer numeroDelAlumno;

    public Alumno(String nombre, Integer numeroDelAlumno){
        this.nombre = nombre;
        this.numeroDelAlumno = numeroDelAlumno;
    }

    public Integer getNumeroDelAlumno() {
        return numeroDelAlumno;
    }

    public boolean equals(Object obj){
        Alumno unoAlumno = (Alumno) obj;
        return this.getNumeroDelAlumno().equals(unoAlumno.getNumeroDelAlumno());
    }
}
