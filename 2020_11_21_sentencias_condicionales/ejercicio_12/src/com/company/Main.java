package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int nota;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca la nota correspondiente");
        System.out.println("----------------------------------");
        System.out.println("Nota: ");
        nota = teclado.nextInt();

        System.out.println("Cualificacion \n-------------");

        if (nota > -1 && nota < 5) {
            System.out.println("Suspenso");

        } else if (nota == 5) {
            System.out.println("Suficiente");

        } else if (nota == 6) {
            System.out.println("Bien");

        } else if (nota > 6 && nota < 9) {
            System.out.println("Notable");

        } else if (nota > 8 && nota < 11) {
            System.out.println("Sobresaliente");

        } else {
            System.out.println("Error");
        }

    }
}
