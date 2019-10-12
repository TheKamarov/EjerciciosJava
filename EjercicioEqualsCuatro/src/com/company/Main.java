package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Empleado unEmpleado = new Empleado("Einstein", 1);
        Empleado dosEmpleado = new Empleado("Robert", 2);
        Empleado tresEmpleado = new Empleado("Chris", 3);
        Empleado cuatroEmpleado = new Empleado("Jose", 4);
        Empleado cincoEmpleado = new Empleado("Pat", 1);


        List<Empleado> listaDeEmpleados = new ArrayList<>();

        listaDeEmpleados.add(unEmpleado);
        listaDeEmpleados.add(dosEmpleado);
        listaDeEmpleados.add(tresEmpleado);
        listaDeEmpleados.add(cuatroEmpleado);

        System.out.println(listaDeEmpleados.contains(cincoEmpleado));
    }
}
