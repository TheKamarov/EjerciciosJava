package com.company;

public class Cuenta {

    //ATRIBUTOS Visibilidad  TipoDeDato  NombreAtributo

    private int numeroDeCuenta;
    private double saldo;
    private Cliente titular;

    //Contstructor
    public Cuenta(int numeroDeCuenta, double saldo, Cliente nombreDelTitular){
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = saldo;
        titular = nombreDelTitular;
    }

    //METODOS   Visibilidad TipoDeDatoRetorno   nombreMetodo(tipoDeDato Parmetro){}

    public void deposito(double cantidadDeDinero){
        System.out.println("se a depositado: " +cantidadDeDinero+ " y usted tenia en su cuenta " +saldo);
        saldo = saldo + cantidadDeDinero;
        System.out.println("Actualmente tienes de saldo: " +saldo);
    }

    public void extraccion(double cantidadDeDinero){
        if(cantidadDeDinero <= saldo){
            System.out.println("se a extraido: " +cantidadDeDinero+ " y usted tenia en su cuenta " +saldo);
            saldo = saldo - cantidadDeDinero;
            System.out.println("Actualmente tienes de saldo: " +saldo);
        }else{
            System.out.println("Fondos insuficientes");
        }
    }
}
