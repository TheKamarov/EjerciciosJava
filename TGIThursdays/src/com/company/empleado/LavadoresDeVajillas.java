package com.company.empleado;

public class LavadoresDeVajillas extends EmpleadosDeLimpieza {

    private Integer roturas;


    public LavadoresDeVajillas(String nombre, String apellido, Integer sueldoMensual){
        super(nombre, apellido, sueldoMensual);
        roturas = 0;
    }

    public void romper(){
        System.out.println("El empleado " + getNombre() + " " + getApellido() +" rompio una vajilla!! :(");
        roturas = roturas + 1;
    }

    private Integer cantidadDescontada(){
         return (roturas * 5);
    }

    @Override
    public Integer cobrarSueldo() {
        return getSueldo() - cantidadDescontada();
    }
}
