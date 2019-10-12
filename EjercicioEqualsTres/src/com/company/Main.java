package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Alumno> listaDeAlumnos = new ArrayList<>();
        Alumno unoAlumno = new Alumno("Franco", 1);
        Alumno dosAlumno = new Alumno("Einstein", 2);
        Alumno tresAlumno = new Alumno("Cesar", 3);
        Alumno cuatroAlumno = new Alumno("Roberto", 4);
        Alumno cincoAlumno = new Alumno("Pepito", 1);

        listaDeAlumnos.add(unoAlumno);
        listaDeAlumnos.add(dosAlumno);
        listaDeAlumnos.add(tresAlumno);
        listaDeAlumnos.add(cuatroAlumno);

        System.out.println(listaDeAlumnos.contains(cincoAlumno));

    }
}
