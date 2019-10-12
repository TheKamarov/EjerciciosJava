package com.company;

public class Main {

    public static void main(String[] args) {

        Persona unaPersona = new Persona("Eduard", "cafeina");
        Persona dosPersona = new Persona("Albert", "Falopa");

        Drogas unaDroga = new Drogas("cafeina");
        Drogas dosDroga = new Drogas("Falopa");
        Medicamento unMedicamento = new Medicamento();

        dosDroga.vender(unaPersona);
        unaDroga.vender(unaPersona);

        unaDroga.vender(dosPersona);
        dosDroga.vender(dosPersona);


        unMedicamento.agregarVendible(dosDroga);
        unMedicamento.agregarVendible(unaDroga);

        unMedicamento.vender(unaPersona);

        unMedicamento.vender(dosPersona);


    }
}
