package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int numero;

        Scanner S = new Scanner(System.in);

        System.out.println("introduzca un numero aleatorio: ");
        numero = S.nextInt();

        if (numero <= -1) {
            System.out.println("el numero introducido es negativo");

        } else {
            System.out.println("el numero introducido es positivo");

        }



    }
}
