package sn.diamniadio.uam.fileDattente.controllers;

public class Ticket {
    private static int dernierTicket = 100;  // Dernier numéro de ticket généré (commence à 1)
    private int numeroTicket;
    private int positionDansFile;
    private static int numeroEnCoursDeTraitement = 1;  // Numéro du ticket en cours de traitement

    public Ticket() {
        this.numeroTicket = dernierTicket++;
        this.positionDansFile = this.numeroTicket;  // Position dans la file = numéro de ticket
    }

    public int getNumeroTicket() {
        return numeroTicket;
    }

    public int getPositionDansFile() {
        return positionDansFile;
    }

    public int getNbreDePersonnesDevant() {
        return this.positionDansFile - 1;  // Nombre de personnes devant vous
    }

    public static int getNumeroEnCoursDeTraitement() {
        return numeroEnCoursDeTraitement;
    }

    public static void setNumeroEnCoursDeTraitement(int numero) {
        numeroEnCoursDeTraitement = numero;
    }
}
