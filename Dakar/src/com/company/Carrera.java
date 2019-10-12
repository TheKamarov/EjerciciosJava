package com.company;

import java.util.ArrayList;
import java.util.List;

public class Carrera {

    //creo los atributos de la clase
    private Double distancia;
    private Integer premioEnDolares;
    private String nombre;
    private Integer cantidadDeVehiculosPermitidos;
    private List<Vehiculo> listaDeVehiculos;
    private SocorristaAuto socorristaAuto;
    private SocorristaMoto socorristaMoto;

    //constructor

    public Carrera(Double distancia, Integer premioEnDolares, String nombre, Integer cantidadDeVehiculosPermitidos) {
        this.distancia = distancia;
        this.premioEnDolares = premioEnDolares;
        this.nombre = nombre;
        this.cantidadDeVehiculosPermitidos = cantidadDeVehiculosPermitidos;
        this.listaDeVehiculos = new ArrayList<>();
        socorristaAuto = new SocorristaAuto();
        socorristaMoto = new SocorristaMoto();
    }

    //METODOS

    //vamos a crear un metodo que de de alta un Auto
    public void darDeAltaUnAuto(Double velocidad, Double aceleracion, Double anguloDeGiro, String patente) {
        //chequeo si hay cupo
        if(hayCupo()){
            //creo un nuevo auto
            Auto auto = new Auto(velocidad,aceleracion,anguloDeGiro,patente);
            //agrego ese auto a mi lista de vehiculos
            listaDeVehiculos.add(auto);
            System.out.println("Auto agregada correctamente");
        }
        else {
            System.out.println("no hay cupo");
        }
    }


    //vamos a crear un metodo que de de alta un Moto
    public void darDeAltaUnMoto(Double velocidad, Double aceleracion, Double anguloDeGiro, String patente) {
        //chequeo si hay cupo
        if(hayCupo()){
            //aca me ahorro la variable y creo la moto directamente en el add
            listaDeVehiculos.add(new Moto(velocidad, aceleracion, anguloDeGiro, patente));
            System.out.println("moto agregada correctamente");
        }else {
            System.out.println("no hay cupo");
        }

    }

    //metodo interno que chequea si hay cupo
    private Boolean hayCupo(){
        return listaDeVehiculos.size() < cantidadDeVehiculosPermitidos;
    }


    //eliminar vehiculo recibiendo el vehiculo que quiere eliminar
    public void eliminarVehiculo(Vehiculo unVehiculo){
        //para que esto funcione tengo que sobreescribir el equals en la clase vehiculo
        if(listaDeVehiculos.remove(unVehiculo)){
            System.out.println("Vehiculo eliminado correctamente");
        }else {
            System.out.println("no se pudo eliminar el vehiculo");
        }

    }

    //overloading de el metodo eliminar
    //eliminar vehiculo recibiendo el la patente del vehiculo que quiere eliminar
    public void eliminarVehiculo(String unaPatente){
        //creo una variable que es el vehiculo que voy a eliminar
        //uso el metodo que cree para encontrar un vehiculo con esa patente
        Vehiculo vehiculoAEliminar = buscarVehiculoPorPatente(unaPatente);
        //uso el metodo eliminar vehiculo que ya habia creado
        eliminarVehiculo(vehiculoAEliminar);
    }

    //metodo para definir el ganador de la carrera
    public Vehiculo definirGanador(){
        //creo una variable donde voy a guardar al ganador, le asigno el primero de la lista
        Vehiculo vehiculoGanador = listaDeVehiculos.get(0);
        //recorro la lista
        for (Vehiculo vehiculo: listaDeVehiculos) {
            //le pregunto al que estoy recorriendo si le gana la ganador
            if(vehiculo.calcularValor() > vehiculoGanador.calcularValor()){
                //si es cierto el que rocorro se vuelve el nuevo ganador
                vehiculoGanador = vehiculo;
            }
        }
        //hago un return del ganador
        return vehiculoGanador;
    }

    public void socorrerAuto(String patente){
        //busco el vehiculo que quiero socorrer con el metodo que ya cree
        //como mi metodo devuelve vehiculo hago un casteo a auto
        //hago un try catch por si lo que me encuentra no es un auto
        try{
            Auto vehiculoASocorrer = (Auto) buscarVehiculoPorPatente(patente);
            socorristaAuto.socorrer(vehiculoASocorrer);
        }catch (ClassCastException e){
            System.out.println("lo que estas intentando socorrer no es un Auto");
        }
    }

    public void socorrerMoto(String patente){
        try{
            Moto vehiculoASocorrer = (Moto) buscarVehiculoPorPatente(patente);
            socorristaMoto.socorrer(vehiculoASocorrer);
        }catch (ClassCastException e){
            System.out.println("lo que estas intentando socorrer no es un Moto");
        }
    }
    private Vehiculo buscarVehiculoPorPatente(String patente){
        Vehiculo vehiculoBuscado = null;
        for (Vehiculo vehiculo:listaDeVehiculos) {
            //busco el vehiculo con la patente que me pasan por parametro
            if(vehiculo.getPatente().equals(patente)){
                //guardo el vehiculo que quiero devolver en mi variable
                vehiculoBuscado = vehiculo;
            }
        }
        //uso el return para devolver vehiculo que ya habia creado
        return vehiculoBuscado;
    }
}
