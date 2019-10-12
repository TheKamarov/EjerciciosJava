package com.company;

public class CajaDeAhorro extends Cuenta{

    private double tasaDeInteres;
    private double saldo;

    public CajaDeAhorro(Cliente titular){
        super(titular);
        saldo = 0.0;
        tasaDeInteres = 20;
    }

    public void cobrarIntereses(double tiempoEnMeses){
        saldo = saldo/100 * (100+(tasaDeInteres * tiempoEnMeses));
        System.out.println("Su cuenta actulmente tiene $" + saldo + " de saldo sumandose los intereses");
    }

    public void mostrarSaldo(){
        System.out.println(saldo);
    }

    public void depositar(Double platita){
        saldo = saldo + platita;
        System.out.println("Se han depositado $"+platita+". Su saldo actual es de $"+saldo);
    }

    public void extraer(Double platita){
        if(platita <= saldo){
            saldo = saldo - platita;
            System.out.println("Se han extraido $"+platita+". Su saldo actual es de $"+saldo);
        } else {
            System.out.println("¡SALDO INSUFICIENTE!");
        }
    }
}
