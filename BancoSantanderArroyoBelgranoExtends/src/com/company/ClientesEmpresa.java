package com.company;

public class ClientesEmpresa extends Cliente{

    private String nombreDeFantasia;

    public ClientesEmpresa(String nombreDeFantasia, String cuit){
        super(null, null, null, null, cuit);
        this.nombreDeFantasia = nombreDeFantasia;
    }
}
