package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //Cliente otroCliente = new Cliente();
        Cliente unCliente = new Cliente("Pat","Ugarte",12344,3356432,"23-23234232-2");
        Cuenta miCuenta = new Cuenta(unCliente);
        CajaDeAhorro miCajaDeAhorro = new CajaDeAhorro(unCliente);
        CuentaCorriente miCuentaCorriente = new CuentaCorriente(unCliente);
        Cheque unCheque = new Cheque(1000, "BBVA", "12/11/2019");

        System.out.println(miCuenta.getSaldo());

        miCuenta.depositar(2000.0);

        System.out.println(miCuenta.getSaldo());

        miCuenta.extraer(2500.0);
        miCuenta.extraer(1000.0);

        miCajaDeAhorro.depositar(2000.0);
        miCajaDeAhorro.extraer(1000.0);
        miCajaDeAhorro.mostrarSaldo();
        miCajaDeAhorro.cobrarIntereses(3);

        miCuentaCorriente.depositarCheques(unCheque);
        miCuentaCorriente.extraer(3001.0);
        miCuentaCorriente.extraer(3000.0);

    }
}