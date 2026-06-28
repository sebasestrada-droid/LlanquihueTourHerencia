package ui;

import data.GestorServicios;

public class Main {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("     SISTEMA SERVICIOS TURÍSTICOS");
        System.out.println("========================================\n");

        GestorServicios gestor = new GestorServicios();

        gestor.mostrarServicios();

        System.out.println("\n========================================");
        System.out.println(" Fin de la ejecución.");
        System.out.println("========================================");
    }
}