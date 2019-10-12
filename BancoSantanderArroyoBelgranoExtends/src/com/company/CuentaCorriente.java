package com.company;

public class CuentaCorriente extends Cuenta {

    private double montoDescubierto;
    private double saldo;
    private Cheque cheque;

    public CuentaCorriente(Cliente titular){
        super(titular);
        saldo = 0.0;
        montoDescubierto = 2000.0;
    }

    public void depositarCheques(Cheque cheque){
        this.cheque = cheque;
        saldo = saldo + cheque.getMonto();
        System.out.println("El monto del cheque era de $" +cheque.getMonto()+" y ahora usted tiene un saldo de $" +saldo);
    }

    public void extraer(Double platita){
        if((saldo + montoDescubierto) >= platita){
            //se le suma la cantidad de dinero que puede girar en descubierto solo para compararlo con la cantidad que desea extrar
            System.out.println("Se esta usando el giro en descubierto");
            saldo = saldo - platita;
            System.out.println("Usted saco $"+platita+" y ahora su saldo actual es de $" +saldo);
        }else{
            System.out.println("SALDO INSUFICIENTE!");
        }
    }
}
