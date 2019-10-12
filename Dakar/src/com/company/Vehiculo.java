package com.company;


import java.util.Objects;

//creo la clase abstracta porque no quiero que nadie pueda crear un instancia de la misma
public abstract class Vehiculo {

    //creo los atributos de la clase
    private Double velocidad;
    private Double aceleracion;
    private Double anguloDeGiro;
    private String patente;
    private Double peso;
    private Integer cantidadDeRuedas;

    //creo un constructor
    public Vehiculo(Double velocidad,Double aceleracion,Double anguloDeGiro,String patente,Double peso,Integer cantidadDeRuedas){
        this.velocidad = velocidad;
        this.aceleracion = aceleracion;
        this.anguloDeGiro = anguloDeGiro;
        this.patente = patente;
        this.peso = peso;
        this.cantidadDeRuedas = cantidadDeRuedas;
    }

    //getter


    public String getPatente() {
        return patente;
    }
    //creo un metodo que me permita calcular el valor de un auto
    public Double calcularValor(){
        return (velocidad * (aceleracion*0.5) / (anguloDeGiro * (peso - cantidadDeRuedas *100)));
    }

    // sobreescribo el equals para indicarle que hace a dos vehiculos iguales
/*    @Override
    public boolean equals(Object obj) {
        //casteo obj a vehiculo
        Vehiculo otroVehiculo = (Vehiculo) obj;
        //le indico que son iguales si tienen la misma patente
        return otroVehiculo.patente.equals(this.patente);
    }*/

    // sobreescribo el equals para indicarle que hace a dos vehiculos iguales
    //lo hago con el generate automatico
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return Objects.equals(this.patente,vehiculo.patente);//patente.equals(vehiculo.patente);
    }

    @Override
    public int hashCode() {
        return patente.hashCode();
    }
}
