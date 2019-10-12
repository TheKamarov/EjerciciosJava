package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        InvitadosDigitalHouse unoInvitadoDH = new InvitadosDigitalHouse("Robert", 4532542);
        InvitadosDigitalHouse dosInvitadoDH = new InvitadosDigitalHouse("Albert", 2364576);
        InvitadosDigitalHouse tresInvitadoDH = new InvitadosDigitalHouse("Eduard", 5345345);

        InvitadosStandars unoInvitadoStandar = new InvitadosStandars("Brian", 45354352);
        InvitadosStandars dosInvitadoStandar = new InvitadosStandars("Jhony", 6435344);
        InvitadosStandars tresInvitadoStandar = new InvitadosStandars("Pepo", 423445);

        FuegosIndividuales unoFuegoArtificial = new FuegosIndividuales("Boom!");
        FuegosIndividuales dosFuegoArtificial = new FuegosIndividuales("Clap!");

        PacksFuegosArtificiales unoPackDeFuegosArtificiales = new PacksFuegosArtificiales();
        PacksFuegosArtificiales dosPackDeFuegosArtificiales = new PacksFuegosArtificiales();

        NonVivoGroupSA unoNonVivoGroupSA = new NonVivoGroupSA();

        unoPackDeFuegosArtificiales.setPackDeFuegosArtificiales(unoFuegoArtificial);
        unoPackDeFuegosArtificiales.setPackDeFuegosArtificiales(dosFuegoArtificial);
        unoPackDeFuegosArtificiales.setPackDeFuegosArtificiales(dosFuegoArtificial);

        dosPackDeFuegosArtificiales.setPackDeFuegosArtificiales(unoPackDeFuegosArtificiales);

        unoNonVivoGroupSA.agregarExplotables(unoFuegoArtificial);
        unoNonVivoGroupSA.agregarExplotables(dosFuegoArtificial);
        unoNonVivoGroupSA.agregarExplotables(unoPackDeFuegosArtificiales);
        unoNonVivoGroupSA.agregarExplotables(dosPackDeFuegosArtificiales);

        unoNonVivoGroupSA.agregarInvitados(unoInvitadoDH);
        unoNonVivoGroupSA.agregarInvitados(dosInvitadoDH);
        unoNonVivoGroupSA.agregarInvitados(tresInvitadoDH);

        unoNonVivoGroupSA.agregarInvitados(unoInvitadoStandar);
        unoNonVivoGroupSA.agregarInvitados(dosInvitadoStandar);
        unoNonVivoGroupSA.agregarInvitados(tresInvitadoStandar);

        unoNonVivoGroupSA.encender();

    }
}
