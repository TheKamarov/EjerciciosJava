package com.company;

public class Ventas {

    //ATRIBUTOS Visibilidad  TipoDeDato  NombreAtributo

    private double montoDeLaVenta;
    private Vehiculos vehiculos;
    private Cliente cliente;
    private int registroDeVentas;

    //Contstructor

    public Ventas(Cliente cliente, Vehiculos vehiculos, double montoDeLaVenta){
        this.cliente = cliente;
        this.vehiculos = vehiculos;
        this.montoDeLaVenta = montoDeLaVenta;
        this.registroDeVentas = 0;
    }

    //METODOS   Visibilidad TipoDeDatoRetorno   nombreMetodo(tipoDeDato Parmetro){}

    public void registrarVenta(Vehiculos vehiculos, Cliente cliente){
        registroDeVentas = registroDeVentas + 1;
        System.out.println("Se a registrado la venta "+registroDeVentas+" del vehiculo " +vehiculos.mostrarVehiculo()+" y el cliente que lo a comprado es " +cliente.mostrarCliente() + " por el monto de $" +montoDeLaVenta);
    }
}
