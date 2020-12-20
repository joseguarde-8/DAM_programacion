package com.company;

public class Main {

    public static void main(String[] args) {

        int j;
        int i = 10;

        System.out.println("Tablas de multiplicar");
        System.out.print("---------------------\n");

        for (int numero = 1; numero <= i; numero++) {
            System.out.println("\nTABLA DEL " + numero );

            for (j = 1; j <= 10; j++) {
                System.out.println(numero + " X " + j + " = " + numero * j);
            }

        }
    }
}
