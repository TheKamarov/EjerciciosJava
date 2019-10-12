package com.company;

import com.company.empleado.EncargadosDeLaLimpiezaGeneral;
import com.company.empleado.LavadoresDeVajillas;

public class Main {

    public static void main(String[] args) {

        LavadoresDeVajillas lavadorVajillasUno = new LavadoresDeVajillas("Robert", "Smith", 1500);
        LavadoresDeVajillas lavadorVajillasDos = new LavadoresDeVajillas("Eduard", "colem", 1750);

        EncargadosDeLaLimpiezaGeneral encargadoUno = new EncargadosDeLaLimpiezaGeneral("Filipo", "Jackson", 2300);
        EncargadosDeLaLimpiezaGeneral encargadoDos = new EncargadosDeLaLimpiezaGeneral("Santiago", "Anderason", 3000);

        for(int i = 0 ; i < 30; i++){
            lavadorVajillasUno.romper();
        }
        System.out.println(lavadorVajillasUno.cobrarSueldo());

        for(int i = 0 ; i < 10; i++){
            lavadorVajillasDos.romper();
        }
        System.out.println(lavadorVajillasDos.cobrarSueldo());

        System.out.println(encargadoUno.cobrarSueldo());

        System.out.println(encargadoDos.cobrarSueldo());

        System.out.println(lavadorVajillasDos.cobrarSueldo());

    }
}
