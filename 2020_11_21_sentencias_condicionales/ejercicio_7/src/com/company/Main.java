package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int numero;

        Scanner teclado = new Scanner(System.in);

        System.out.println("introduzca un número: ");
        numero = teclado.nextInt();

        if (numero % 2 == 0) {
            System.out.println("el número introducido es par");

        } else {
            System.out.println("el número introducido es impar");
        }

    }
}
