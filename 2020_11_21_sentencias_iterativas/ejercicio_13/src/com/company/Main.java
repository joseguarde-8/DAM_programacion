package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int alturaPiramide;
        int asteriscos = 1;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        alturaPiramide = teclado.nextInt();

        while (alturaPiramide >= 0) {

            for (int k = 0; k < alturaPiramide; k++) {
                // Imprimir i espacios en blanco
                System.out.print(" ");
            }

            for (int k = 0; k < asteriscos; k++) {
                // Imprimir j espacios asteriscos
                System.out.print("*");
            }
            System.out.println();

            alturaPiramide--;
            asteriscos += 2;
        }
    }
}
