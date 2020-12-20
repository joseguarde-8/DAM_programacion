package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	int acertadas , falladas;

	Scanner teclado = new Scanner(System.in);
        System.out.println("Respuestas \n----------");
        System.out.println("acertadas:");
        acertadas = teclado.nextInt();
        System.out.println("falladas:");
        falladas = teclado.nextInt();

        float puntuacionAcertadas = acertadas * 0.5f;
        float puntuacionFinal = puntuacionAcertadas - falladas * 0.25f;

        System.out.println("\nNota final");
        System.out.println("----------");

        if (acertadas + falladas > -1 && acertadas + falladas < 21) {

            System.out.println(puntuacionFinal);

        } else {
            System.out.println("Datos erroneos");
        }

        System.out.println("\nCualificacion \n-------------");

        if (puntuacionFinal > -1 && puntuacionFinal < 5) {
            System.out.println("Suspenso");

        } else if (puntuacionFinal == 5) {
            System.out.println("Suficiente");

        } else if (puntuacionFinal == 6) {
            System.out.println("Bien");

        } else if (puntuacionFinal > 6 && puntuacionFinal < 9) {
            System.out.println("Notable");

        } else if (puntuacionFinal > 8 && puntuacionFinal < 11) {
            System.out.println("Sobresaliente");

        } else {
            System.out.println("Error");
        }

    }
}
