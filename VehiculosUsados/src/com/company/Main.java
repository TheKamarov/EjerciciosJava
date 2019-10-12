package com.company;

public class Main {

    public static void main(String[] args) {
        Vehiculos primerVehiculo = new Vehiculos("Bugatti","235A568B", 2018,"rojo",35.6);

        Cliente primerCliente = new Cliente("Justin", "Bieber", "JustinContactos@gmail.com");

        Ventas primeraVenta = new Ventas(primerCliente, primerVehiculo,630000.0);

        primeraVenta.registrarVenta(primerVehiculo,primerCliente);
    }
}
