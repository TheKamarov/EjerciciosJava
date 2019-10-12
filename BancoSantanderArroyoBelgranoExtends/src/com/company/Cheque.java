package com.company;

public class Cheque {

    private double monto;
    private String bancoEmisor;
    private String fechaDePago;

    public Cheque(double monto, String bancoEmisor, String fechaDePago){
        this.monto = monto;
        this.bancoEmisor = bancoEmisor;
        this.fechaDePago = fechaDePago;
    }

    public double getMonto(){
        return monto;
    }
}
