package com.company;

public class Main {

    public static void main(String[] args) {
        Cliente primerCliente = new Cliente("Luis", "Miguel");
        Cliente segundoCliente = new Cliente("Pablo", "Lescano");
        Cliente tercerCliente = new Cliente("Noelia", "Michelini");

        Cuenta primeraCuenta = new Cuenta(1,0.0, primerCliente);
        Cuenta SegundaCuenta = new Cuenta(2,0.0, segundoCliente);
        Cuenta terceraCuenta = new Cuenta(3, 0.0, tercerCliente);

        primeraCuenta.deposito(500.50);
        primeraCuenta.extraccion(500.5);
        SegundaCuenta.deposito(400.5);
        SegundaCuenta.extraccion(400.5);
        terceraCuenta.deposito(50000.0);
        terceraCuenta.extraccion(20000.0);

    }
}
