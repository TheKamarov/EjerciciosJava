package com.company.empleado;

public class EncargadosDeLaLimpiezaGeneral extends EmpleadosDeLimpieza{

    public EncargadosDeLaLimpiezaGeneral(String nombre, String apellido, Integer sueldoMensual){
        super(nombre,apellido,sueldoMensual);
    }

    @Override
    public Integer cobrarSueldo() {
        return getSueldo();
    }
}
